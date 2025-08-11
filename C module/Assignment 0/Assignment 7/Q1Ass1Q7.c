#include<stdio.h>
void tsalary(int *bs);
void main()
{
    int bs;
    printf("Enter a basic:");
	scanf("%d",&bs);
    tsalary(&bs);
}
void tsalary(int *bs)
{
    double da,ta,hra,ts;
    if(*bs<5000)
    {
        da=*bs*10/100;
        ta=*bs*0.15;
        hra=*bs*0.20;
    }
    else
    {
        da=*bs*0.15;
        ts=*bs+da+hra;
    }
    printf("Ts=%f",ts);
}
