#include<stdio.h>
void merge(int *arr,int *brr);
void main()
{
	int arr[5],brr[5],crr[10],i;
	for(i=0;i<5;i++)
	{
		printf("Enter 5 Element First Array:");
		scanf("%d", &arr[i]);
    }
    for(i=0;i<5;i++)
	{
		printf("Enter 5 Element Second Array:");
		scanf("%d", &brr[i]);
    }
    merge(arr,brr);
}
void merge(int *arr,int *brr)
{
	int crr[10],i,j;
    for(i=0;i<5;i++)
    {
    	crr[i]=arr[i];
	}
	for(j=0;j<5;j++)
    {
    	crr[i]=brr[j];
    	i++;
	}
	printf("Merge two arrays:\n");
	for(i=0;i<10;i++)
    {
    	printf("%d ",crr[i]);
	}
}
