#include<stdio.h>
void main()
{
	int arr[6],brr[6],crr[6],i;
	for(i=0;i<6;i++)
	{
		printf("Enter 6 Element First Array:");
		scanf("%d", &arr[i]);
    }
    for(i=0;i<6;i++)
	{
		printf("Enter 6 Element Second Array:");
		scanf("%d", &brr[i]);
    }
    for(i=0;i<6;i++)
    {
    	crr[i]=arr[i]+brr[i];
	}
    printf("Sum of two arrays:");
    for(i=0;i<6;i++)
    {
    	printf("%d ",crr[i]);
	}
}

