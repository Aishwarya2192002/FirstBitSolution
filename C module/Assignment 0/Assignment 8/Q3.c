#include<stdio.h>
void sumof(int *arr,int size);
void main()
{
	int arr[10],i;
	for(i=0;i<10;i++)
	{
		printf("Enter the element in array:");
		scanf("%d", &arr[i]);
    }
    sumof(arr,10);
}
void sumof(int *arr,int size)
{
	int i,sum=0;
    for(i=0;i<size;i++)
    {
    	sum=sum+arr[i];
	}
	printf("Sum of all numbers is:%d",sum);
}
