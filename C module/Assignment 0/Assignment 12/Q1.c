#include<stdio.h>
#include <stdlib.h>
void maximum(int *arr,int size);
void minimum(int *arr,int size);
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
        printf("Enter element %d: ",i+1);
        scanf("%d",&arr[i]);
    }
	 maximum(arr,n);
	 minimum(arr,n);
	 free(arr);
}
void maximum(int *arr,int size)
{
	int max=arr[0],i;
	for(i=1;i<size;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	printf("The maximum number is:%d\n",max);
}
void minimum(int *arr,int size)
{
	int min=arr[0],i;
	for(i=1;i<size;i++)
	{
		if(arr[i]<min)
		{
			min=arr[i];
		}
	}
		printf("The minimum number is:%d\n",min);
}
