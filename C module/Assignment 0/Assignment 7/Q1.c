#include<stdio.h>
void main()
{
	int arr[5],i,max,min;
	for(i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	max=arr[0];
	for(i=1;i<5;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	printf("The maximum number is:%d",max);
	printf("\n");
	min=arr[0];
	for(i=1;i<5;i++)
	{
		if(arr[i]<min)
		{
			min=arr[i];
		}
	}
		printf("The minimum number is:%d",min);
}
