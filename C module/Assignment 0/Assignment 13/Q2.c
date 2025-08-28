#include<stdio.h>
struct Employee
{
	int Id;
	char Name[20];
	int Salary;
};
void main()
{
	struct Employee e1;
	printf("Enter Employee Id:");
	scanf("%d",&e1.Id);
	printf("Enter Employee Name:");
	scanf("%s",e1.Name);
	printf("Enter Employee Salary:");
	scanf("%d",&e1.Salary);
	
	printf("Id:%d\n",e1.Id);
	printf("Name:%s\n",e1.Name);
	printf("Salary:%d\n",e1.Salary);
}
