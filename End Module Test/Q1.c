#include <stdio.h>
void main() 
{
    int start, end, i, j, isPrime, sum = 0;
    printf("Enter start of range: ");
    scanf("%d", &start);
    printf("Enter end of range: ");
    scanf("%d", &end);
    if (start < 2)      
        start = 2;
    printf("Prime numbers between %d and %d are: ", start, end);
    for (i = start; i <= end; i++)
	{
        isPrime = 1;                
        for (j = 2; j * j <= i; j++) 
		{
            if (i % j == 0) 
			{
                isPrime = 0;
                break;
            }
        }
        if (isPrime)
		{
            printf("%d ", i);
            sum += i;
        }
    }

    printf("\nSum of prime numbers from %d to %d = %d\n", start, end, sum);
}

