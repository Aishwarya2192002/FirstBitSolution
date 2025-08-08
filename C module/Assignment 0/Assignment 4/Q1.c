#include<stdio.h>
void main()
{
	int no;
	printf("Enter Number:");
	scanf("%d",&no);
	int count=0,temp=no;
	while(no>0)
	{
		count++;
		no=no/10;
	}
	no=temp;
	int sum=0,rem;
	while(no>0)
	{
		rem=no%10;
		int res=1,i;
		for(i=1;i<=count;i++)
		{
			res=res*rem;
		}
			sum=sum+res;
			no=no/10;
	}
	
	if(sum==temp)
	{
		printf("Armstrong Number");
	}
	else
	{
		printf("Not Armstrong Number");
	}
}

