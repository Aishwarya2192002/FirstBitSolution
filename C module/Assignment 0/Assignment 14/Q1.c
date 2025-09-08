#include<stdio.h>
typedef struct
{
	char bname[20];
	int id;
	char author[20];
	int price;
	
}Book;
Book storebook();
void displayBook(Book b);
void main()
{
	Book b;
	b=storebook();
	displayBook(b);
}
Book storebook()
{
	Book temp;
	scanf("%s",&temp.bname);
	scanf("%d",&temp.id);
	scanf("%s",&temp.author);
	scanf("%d",&temp.price);
	return temp;
}
void displayBook(Book b)
{
	printf("Book Name:%s\n",b.bname);
	printf("Book Id:%d\n",b.id);
	printf("Book Author:%s\n",b.author);
	printf("Book Price:%d\n",b.price);
}
