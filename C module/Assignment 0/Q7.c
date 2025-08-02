#include<stdio.h>
void main()
{
    int min=130;
    int hour;
    hour=min/60;
    min=min%60;
    printf("Hour=%d & minutes=%d",hour,min);
}