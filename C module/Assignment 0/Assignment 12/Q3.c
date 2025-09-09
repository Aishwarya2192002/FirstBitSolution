#include<stdio.h>
#include <stdlib.h>
void sumof(int *arr,int size);
void main()
{
	int *arr,i,n;
	printf("Enter the size of array:");
	scanf("%d",&n);
    arr=(int*)malloc(sizeof(int)*n);
    if(arr==NULL)
    {
    	printf("Memory not allocated!\n");
	}
	for(i=0;i<n;i++)
	{
		printf("Enter the element in array:");
		scanf("%d", &arr[i]);
    }
    sumof(arr,n);
    free(arr);
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
