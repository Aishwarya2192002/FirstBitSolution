#include <stdio.h>
void main()
{
    int start, end,i;
    int sum = 0, count = 0;
    printf("Enter start and end value: ");
    scanf("%d %d", &start, &end);
    for (i = start; i <= end; i++)
    {
        if (count % 2 == 0)   
            sum =sum + i;
        count++;
    }
    printf("Sum of alternate numbers = %d\n", sum);
}

