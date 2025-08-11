#include<stdio.h>
void per(int *sub1,int *sub2,int *sub3,int *sub4,int *sub5);
void main()
{
   int sub1,sub2,sub3,sub4,sub5;
    printf("Enter a mark 1:");
	scanf("%d",&sub1);
	printf("Enter a mark 2:");
	scanf("%d",&sub2);
	printf("Enter a mark 3:");
	scanf("%d",&sub3);
	printf("Enter a mark 4:");
	scanf("%d",&sub4);
	printf("Enter a mark 5:");
	scanf("%d",&sub5);
   per(&sub1,&sub2,&sub3,&sub4,&sub5);
}
void per(int *sub1,int *sub2,int *sub3,int *sub4,int *sub5)
{
    int  total=*sub1+*sub2+*sub3+*sub4+*sub5;
    float res1=(total/500.0)*100;
    printf("The percentage of marks:%2f",res1);
    
}


