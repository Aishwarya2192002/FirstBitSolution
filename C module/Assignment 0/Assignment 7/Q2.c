#include<stdio.h>
void main()
{
	int arr[5],num,i,flag=0;
	for(i=0;i<5;i++)
	{
		scanf("%d", &arr[i]);
		
    }
	printf("Enter search number:",num);
	scanf("%d", &num);
	for(i=0;i<5;i++)
    {
		if (arr[i] == num)
		{
			printf("The Number is found at position:%d",i);
			flag=1;
			break;
		}
   }
   if(!flag)
   {
   	printf("The number is not found");
   }
		
}
	

