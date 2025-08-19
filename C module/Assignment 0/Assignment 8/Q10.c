#include<stdio.h>
void sort(int *arr,int size);
void main()
{
	int arr[10],size,i,j,temp;
	printf("Enter the size of array:");
	scanf("%d",&size);
	printf("Enter the element in array:");
	for(i=0;i<size;i++)
	{
		scanf("%d",&arr[i]);
	}
	sort(arr,size);
}
void sort(int *arr,int size)
{
	int i,j,temp;
	for(i = 0; i < size-1; i++)
    {
        for(j = 0; j < size-1-i; j++)
        {
            if(arr[j] > arr[j+1])
            {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
	}   
    printf("Sorted Array:");
    for(i = 0; i < size; i++)
    {
        printf("%d ", arr[i]);
    }
}
