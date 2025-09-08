#include <stdio.h>

typedef struct 
{
    int hour;
    int min;
    int sec;
} Time;

Time storeTime();
void displayTime(Time t);
int timeToSecond(Time t);
Time addTime(Time t1, Time t2);

void main()
{
    Time t1, t2, sum;
    
    printf("Enter first time : ");
    t1 = storeTime();
    
    printf("Enter second time: ");
    t2 = storeTime();
    
    printf("\nFirst time: ");
    displayTime(t1);
    
    printf("\nSecond time: ");
    displayTime(t2);
    
    sum = addTime(t1, t2);
    printf("\nSum of times: ");
    displayTime(sum);
    
    printf("\n\nFirst time in seconds: %d", timeToSecond(t1));
    printf("\nSecond time in seconds: %d", timeToSecond(t2));
    printf("\nSum of times in seconds: %d", timeToSecond(sum));
}

Time storeTime()
{
    Time temp;
    scanf("%d %d %d", &temp.hour, &temp.min, &temp.sec);
    return temp;
}

Time addTime(Time t1, Time t2)
{
    Time result;
    result.sec = t1.sec + t2.sec;
    result.min = t1.min + t2.min + result.sec / 60; // seconds to minutes
    result.sec = result.sec % 60;
    result.hour = t1.hour + t2.hour + result.min / 60; // minutes to hours
    result.min = result.min % 60;
    return result;
}

int timeToSecond(Time t)
{
    return t.hour * 3600 + t.min * 60 + t.sec;
}

void displayTime(Time t)
{
    printf("%02d:%02d:%02d", t.hour, t.min, t.sec);
}

