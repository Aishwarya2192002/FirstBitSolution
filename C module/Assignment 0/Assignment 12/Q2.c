#include<stdio.h>
#include <stdlib.h>
void search(int *arr,int size,int num);
void main()
{
	int *arr,num,i,n;
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
    search(arr,n,num);
    free(arr);
}
void search(int *arr,int size,int num)
{
	int i,flag=0;
	printf("Enter search number:",num);
	scanf("%d", &num);
	for(i=0;i<size;i++)
    {
		if (arr[i] == num)
		{
			printf("The Number is found at position:%d",i);
			flag=1;
			break;
		}
   }
   if(flag==0)
   {
   	printf("The number is not found");
   }
		
}
	

