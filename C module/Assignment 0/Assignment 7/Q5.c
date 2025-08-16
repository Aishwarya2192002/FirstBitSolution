#include<stdio.h>
void main()
{
	int arr[6],i;
	for(i=0;i<6;i++)
	{
		scanf("%d", &arr[i]);
    }
    for(i=0;i<6;i=i+2)
    {
    	printf("%d ",arr[i]);
	}
}

