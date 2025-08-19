#include<stdio.h>
void search(int *arr,int size,int num);
void main()
{
	int arr[5],num,i;
	for(i=0;i<5;i++)
	{
		printf("Enter the element in array:");
		scanf("%d", &arr[i]);
    }
    search(arr,5,num);
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
	

