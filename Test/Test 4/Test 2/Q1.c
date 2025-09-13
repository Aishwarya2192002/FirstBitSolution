#include <stdio.h>
void main() 
{
    int units;
    float bill = 0;
    printf("Enter the electricity units consumed: ");
    scanf("%d", &units);
    if (units <= 50) 
	{
        bill = units * 3.0;
    } else if (units <= 150) 
	{
        bill = 50 * 3.0 + (units - 50) * 5.0;
    } else 
	{
        bill = 50 * 3.0 + 100 * 5.0 + (units - 150) * 10.0;
    }
    printf("Electricity Bill = Rs %.2f\n", bill);
}

