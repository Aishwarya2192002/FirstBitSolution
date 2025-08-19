#include<stdio.h>
void alterno(int *arr,int size);
void main()
{
	int arr[6],i;
	for(i=0;i<6;i++)
	{
		printf("Enter the element in array:");
		scanf("%d", &arr[i]);
    }
    alterno(arr,6);
}
void alterno(int *arr,int size)
{
	int i;
    printf("Alter the number:");
    for(i=0;i<size;i=i+2)
    {
    	printf("%d ",arr[i]);
	}
}

