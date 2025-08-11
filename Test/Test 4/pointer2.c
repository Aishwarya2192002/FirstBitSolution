#include <stdio.h>
void power(int *, int *);  
void main()
{
    int base, exp;
    printf("Enter a base: ");
    scanf("%d", &base);
    printf("Enter a exponent: ");
    scanf("%d", &exp);
    power(&base, &exp);  
}

void power(int *b, int *e)
{
    int i;
    int result = 1;
    for (i = 1; i <= *e; i++)
    {
        result = result * (*b);
    }
    printf("%d ^ %d = %d", *b, *e, result);
}

