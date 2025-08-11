#include<stdio.h>
void squares(int *a);
void cubes(int *a);
void main()
{
	int a;
	printf("Enter a number:");
	scanf("%d",&a);
	int b;
	printf("Enter a number:");
	scanf("%d",&b);
    squares(&a);
    cubes(&b);
}
void squares(int *a)
{
    int res1=*a**a;
    printf("The Square is :%d\n",res1);
}
void cubes(int *b)
{
	int res2=*b**b**b;
	printf("The Cube is :%d",res2);
}

