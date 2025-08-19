#include<stdio.h>
void reverse(int *arr,int size);
void main()
{
	int arr[10],size,i;
	printf("Enter the size of array:");
	scanf("%d",&size);
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
