#include<stdio.h>
#include <stdlib.h>
void alterno(int *arr,int size);
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
    alterno(arr,n);
    free(arr);
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

