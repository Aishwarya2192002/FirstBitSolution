#include<stdio.h>
struct Distance
{
	int feet;
	int inch;
};
void main()
{
	struct Distance d1;
	printf("Enter Distance(feet):");
	scanf("%d",&d1.feet);
	printf("Enter Distance(inch):");
	scanf("%d",&d1.inch);
	if(d1.inch>=12)
	{
		d1.feet +=d1.inch/12;
		d1.inch=d1.inch%12;
	}
	printf("%d feet %d inch",d1.feet,d1.inch);
}
