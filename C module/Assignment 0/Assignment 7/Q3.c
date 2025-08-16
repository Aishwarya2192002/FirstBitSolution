#include<stdio.h>
void main()
{
	int arr[10],num,i,sum=0;
	for(i=0;i<10;i++)
	{
		scanf("%d", &arr[i]);
    }
    for(i=0;i<10;i++)
    {
    	sum=sum+arr[i];
	}
	printf("Sum of all numbers is:%d",sum);
}
