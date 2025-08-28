#include<stdio.h>
struct HR
{
	int Id;
	char Name[20];
	int Salary;
	int Commission;
};
void main()
{
	struct HR h1;
	printf("Enter HR Id:");
	scanf("%d",&h1.Id);
	printf("Enter HR Name:");
	scanf("%s",h1.Name);
	printf("Enter HR Salary:");
	scanf("%d",&h1.Salary);
	printf("Enter HR Commission:");
	scanf("%d",&h1.Commission);
	
	printf("Id:%d\n",h1.Id);
	printf("Name:%s\n",h1.Name);
	printf("Salary:%d\n",h1.Salary);
	printf("Commission:%d\n",h1.Commission);
}
