#include<stdio.h>
void main()
{
    double bs=8000;
    double da,ta,hra,ts;
    if(bs<5000)
    {
        da=bs*10/100;
        ta=bs*0.15;
        hra=bs*0.20;
    }
    else
    {
        da=bs*0.15;
        ts=bs+da+hra;
    }
    printf("Ts=%f",ts);
}