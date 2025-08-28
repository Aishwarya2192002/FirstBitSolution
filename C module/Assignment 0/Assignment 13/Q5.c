#include<stdio.h>
struct SalesManager
{
	int Id;
	char Name[20];
	int Salary;
	int Incentive;
	int Target;
};
void main()
{
	struct SalesManager s1;
	printf("Enter SalesManager Id:");
	scanf("%d",&s1.Id);
	printf("Enter SalesManager Name:");
	scanf("%s",s1.Name);
	printf("Enter SalesManager Salary:");
	scanf("%d",&s1.Salary);
	printf("Enter SalesManager Incentive:");
	scanf("%d",&s1.Incentive);
	printf("Enter SalesManager Target:");
	scanf("%d",&s1.Target);
	
	printf("Id:%d\n",s1.Id);
	printf("Name:%s\n",s1.Name);
	printf("Salary:%d\n",s1.Salary);
	printf("Incentive:%d\n",s1.Incentive);
	printf("Target:%d\n",s1.Target);
}
