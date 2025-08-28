#include<stdio.h>
struct Admin
{
	int Id;
	char Name[20];
	int Salary;
	int Allowance;
};
void main()
{
	struct Admin a1;
	printf("Enter Admin Id:");
	scanf("%d",&a1.Id);
	printf("Enter Admin Name:");
	scanf("%s",a1.Name);
	printf("Enter Admin Salary:");
	scanf("%d",&a1.Salary);
	printf("Enter Admin Allowance:");
	scanf("%d",&a1.Allowance);
	
	printf("Id:%d\n",a1.Id);
	printf("Name:%s\n",a1.Name);
	printf("Salary:%d\n",a1.Salary);
	printf("Allowance:%d\n",a1.Allowance);
}
