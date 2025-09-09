#include<Stdio.h>
void main()
{
	int i,j,n1,n2;
	printf("Enter Size Of 1st Array:");
	scanf("%d",&n1);
	int arr[n1];
	for(i=0;i<n1;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("Enter Size Of 2nd Array:");
	scanf("%d",&n2);
	int brr[n2];
	for(i=0;i<n2;i++)
	{
		scanf("%d",&brr[i]);
	}
	printf("Common Element in Array:");
	for(i=0;i<n1;i++)
	{
		for(j=0;j<n2;j++)
		{
			if(arr[i]==brr[j])
			{
				printf("%d",arr[i]);
			}
		}
	}
}
