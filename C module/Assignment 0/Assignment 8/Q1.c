#include<stdio.h>
void maximum(int *arr,int size);
void minimum(int *arr,int size);
void main()
{
	int arr[5],i;
	for(i=0;i<5;i++)
	{
		printf("Enter the element in array:");
		scanf("%d",&arr[i]);
	}
	 maximum(arr,5);
	 minimum(arr,5);
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
