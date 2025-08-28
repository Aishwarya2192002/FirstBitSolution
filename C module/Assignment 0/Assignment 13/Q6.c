#include<stdio.h>
struct Date
{
	int date;
	int month;
	int year;
};
void main()
{
	struct Date d1;
	printf("Enter Date:");
	scanf("%d",&d1.date);
	printf("Enter Month:");
	scanf("%d",&d1.month);
	printf("Enter Year:");
	scanf("%d",&d1.year);
	
	printf("%d-%d-%d",d1.date,d1.month,d1.year);
}
