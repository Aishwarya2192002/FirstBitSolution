#include<stdio.h>
void main()
{
	int arr[10],num,i,flag=0;
	for(i=0;i<10;i++)
	{
		scanf("%d", &arr[i]);
    }
	printf("Even Numbers:");
	for(i=0;i<10;i++)
	{
		if (arr[i]%2==0)
		{
			printf("%d ",arr[i]);
		}
	}
	printf("\n");
	printf("Odd Numbers:");
	for(i=0;i<10;i++)
	{
		if (arr[i] %2!=0)
		{
			printf("%d ",arr[i]);
		}
    }
}
