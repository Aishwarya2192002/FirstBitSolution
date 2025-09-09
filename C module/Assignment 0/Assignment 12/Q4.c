#include<stdio.h>
#include <stdlib.h>
void Even(int *arr,int size );
void Odd(int *arr,int size );
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
    Even(arr,n);
    Odd(arr,n);
    free(arr);
}
void Even(int *arr,int size )
{
	int i;
	printf("Even Numbers:\n");
	for(i=0;i<size;i++)
	{
		if (arr[i]%2==0)
		{
			printf("%d ",arr[i]);
		}
	}
}
void Odd(int *arr,int size )
{
	int i;
	printf("Odd Numbers:\n");
	for(i=0;i<size;i++)
	{
		if (arr[i] %2!=0)
		{
			printf("%d ",arr[i]);
		}
    }
}
