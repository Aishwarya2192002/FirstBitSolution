#include<stdio.h>
#include <stdlib.h>
void merge(int *arr,int *brr,int n);
void main()
{
	int *arr,*brr,*crr,i,n;
	printf("Enter size of array: ");
    scanf("%d", &n);
    arr = (int*) malloc(sizeof(int) * n);
    brr = (int*) malloc(sizeof(int) * n);
    crr = (int*) malloc(sizeof(int) * n);

    if(arr == NULL || brr == NULL || crr == NULL)
    {
        printf("Memory not allocated!\n");
        return;
    }
	for(i=0;i<n;i++)
	{
		printf("Enter  Element First Array:");
		scanf("%d", &arr[i]);
    }
    for(i=0;i<n;i++)
	{
		printf("Enter  Element Second Array:");
		scanf("%d", &brr[i]);
    }
    merge(arr,brr,n);
}
void merge(int *arr,int *brr,int n)
{
	int *crr,i,j;
    for(i=0;i<n;i++)
    {
    	crr[i]=arr[i];
	}
	for(j=0;j<n;j++)
    {
    	crr[i]=brr[j];
    	i++;
	}
	printf("Merge two arrays:\n");
	for(i=0;i<n;i++)
    {
    	printf("%d ",crr[i]);
	}
}
