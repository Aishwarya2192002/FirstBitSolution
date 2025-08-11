#include<stdio.h>
void leap(int *year);
void main()
{
	int year;
	printf("Enter a year:");
	scanf("%d",&year);
    leap(&year);
}
void leap(int *year)
{
    if(*year%4==0 && *year%100)
        printf("This is leap year");
    else
        printf("This is not leap year");
}
