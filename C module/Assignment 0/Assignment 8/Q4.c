#include<stdio.h>
void Even(int *arr,int size );
void Odd(int *arr,int size );
void main()
{
	int arr[10],i;
	for(i=0;i<10;i++)
	{
		printf("Enter the element in array:");
		scanf("%d", &arr[i]);
    }
    Even(arr,10);
    Odd(arr,10);
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
