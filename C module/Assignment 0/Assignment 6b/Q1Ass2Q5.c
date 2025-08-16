#include<stdio.h>
void tprice(int *price);
void main()
{
	int price;
	printf("Enter a price:");
	scanf("%d",&price);
   tprice(&price);
}
void tprice(int *price )
{
	char isstudent='y';
	double Tprice;
	
	if(isstudent=='y')
	{
		if(*price>500)
		{
			Tprice=*price-*price*0.20;
		}
		else
		{
			Tprice-*price*0.10;
		}
	}
	else
	{
		if(*price>600)
		{
			printf("no discount");
		}
		else
		{
			Tprice=*price;
		}
	}
	printf("The final price of customer %1f",Tprice);
}
