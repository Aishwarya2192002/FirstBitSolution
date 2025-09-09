#include<stdio.h>
#include <stdlib.h>
void sumof(int *arr,int *brr,int *crr,int n);
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
    sumof(arr,brr,crr,n);
}
void sumof(int *arr,int *brr,int *crr,int n)
{
	int i;
    for(i=0;i<n;i++)
    {
    	crr[i]=arr[i]+brr[i];
	}
    printf("Sum of two arrays:");
    for(i=0;i<n;i++)
    {
    	printf("%d ",crr[i]);
	}
}

