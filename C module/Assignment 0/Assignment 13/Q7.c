#include<stdio.h>
struct Time
{
	int hour;
	int min;
	int sec;
};
void main()
{
	struct Time t1;
	printf("Enter Hour:");
	scanf("%d",&t1.hour);
	printf("Enter Minute:");
	scanf("%d",&t1.min);
	printf("Enter Second:");
	scanf("%d",&t1.sec);
	
	printf("%d:%d:%d",t1.hour,t1.min,t1.sec);
}
