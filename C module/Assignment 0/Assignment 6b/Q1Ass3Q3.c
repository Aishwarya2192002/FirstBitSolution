#include<stdio.h>
void sumof(int *start,int *end);
void main()
{
	int start,end;
	printf("Enter number start:");
	scanf("%d",&start);
	printf("Enter number end:");
	scanf("%d",&end);
	sumof(&start,&end);
}
void sumof(int *start,int *end)
{
	int sum=0;
	int i=*start;
	while(i<=*end)
	{
		sum=sum+i;
		i++;
	}
	printf("%d",sum);
}
