#include<stdio.h>
void main()
{
    int num=121,r1,r2,r3,q1,rev;
    r1=num%10;
    q1=num/10;
    r2=q1%10;
    r3=q1/10;
    rev=r1*100+r2*10+r3;
    if(num==rev)
    {
        printf("The Number is Pallindrome");
    }
    else
    {
        printf("The Number is not pallindrome");
    }

}