#include<stdio.h>
#include <stdlib.h>
void reverse(int *arr,int size);
void main()
{
	int *arr,i,size;
	printf("Enter the size of array:");
	scanf("%d",&size);
	arr=(int*)malloc(sizeof(int)*size);
    if(arr==NULL)
    {
    	printf("Memory not allocated!\n");
	}
	printf("Enter the element in array:");
	for(i=0;i<size;i++)
	{
		scanf("%d",&arr[i]);
	}
	reverse(arr,size);
}
void reverse(int *arr,int size)
{
     int i;
	printf("Array in reverse order:");
	for(i=size-1;i>=0;i--)
	{
		printf("%d ",arr[i]);
	}
}
