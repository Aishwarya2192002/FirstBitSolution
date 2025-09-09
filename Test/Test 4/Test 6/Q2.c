#include<Stdio.h>
void main()
{
	int n,i;
	printf("Enter Size Of Array:");
	scanf("%d",&n);
	int arr[n];
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	int firstMax,secondMax;
	if(arr[0]>arr[1])
	{
		firstMax=arr[0];
		secondMax=arr[1];
	}
	else
	{
		firstMax=arr[1];
		secondMax=arr[0];
	}
	for(i=2;i<n;i++)
	{
		if(arr[i]>firstMax)
		{
		   secondMax=firstMax;
		   firstMax=arr[i];
	    }
	    else if(arr[i]>secondMax && arr[i]!=firstMax)
	    {
	    	secondMax=arr[i];
		}
	}
	printf("First Maximum Number:%d\n",firstMax);
	printf("Second Maximum Number:%d",secondMax);
}
	
	
	
	
