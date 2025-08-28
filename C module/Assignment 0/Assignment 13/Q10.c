#include<stdio.h>
struct Product
{
	int Id;
	char Name[30];
	int Quantity;
	int Price;
};
void main()
{
	struct Product p1;
	printf("Enter Product Id:");
	scanf("%d",&p1.Id);
	printf("Enter Product Name:");
	scanf("%s",p1.Name);
	printf("Enter Product Quantity:");
	scanf("%d",&p1.Quantity);
	printf("Enter Product Price:");
	scanf("%d",&p1.Price);
	
	printf("Id:%d\n",p1.Id);
	printf("Name:%s\n",p1.Name);
	printf("Quantity:%d\n",p1.Quantity);
	printf("Price:%d\n",p1.Price);
}
