#include<stdio.h>
typedef struct
{
	char name[50];
	int price;
	int quantity;
}product;
void acceptProduct(product products[],int n);
void displayProduct(product products[],int n);
void main()
{
	int n;
	printf("Enter Number of product to store");
	scanf("%d",&n);
	product products[n];
	acceptProduct(products, n);
	displayProduct(products, n);
}
void acceptProduct(product products[],int n)
{
	int i;
	for(i=0;i<n;i++)
	{
		printf("Enter name:");
		scanf("%s",products[i].name);
		printf("Enter price:");
		scanf("%d",&products[i].price);
		printf("Enter quantity:");
		scanf("%d",&products[i].quantity);
	}
}
void displayProduct(product products[],int n)
{
	int i;
	for(i=0;i<n;i++)
	{
		printf("%s\n%d\n%d\n",products[i].name,products[i].price,products[i].quantity);
	}
}
