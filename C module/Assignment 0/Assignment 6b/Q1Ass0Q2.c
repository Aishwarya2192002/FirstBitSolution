#include<stdio.h>
void  areas(int *r);
void main()
{
	 int r;
	printf("Enter a vlaue radius:");
	scanf("%d",&r);
	areas(&r);
}
void areas(int *r)
{
	float  pi=3.14;
    float area= pi **r **r;
    printf("%2f",area);
}
