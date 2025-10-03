#include<stdio.h>
void main()
{
    int year=2004;
    if(year%4==0 && year%100)
    {
        printf("This is leap year");
    }
    else
    {
        printf("This is not leap year");
    }
}
