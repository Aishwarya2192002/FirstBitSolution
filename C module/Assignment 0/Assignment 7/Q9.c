#include<stdio.h>
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
	printf("Array in reverse order:");
	for(i=size-1;i>=0;i--)
	{
		printf("%d ",arr[i]);
	}
}
