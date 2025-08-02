#include<stdio.h>
void main()
{
    int a=12;
    int b=15;
    int temp;
    temp=a;
    a=b;
    b=temp;
    printf("a=%d \nb=%d",a,b);
}