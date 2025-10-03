#include <stdio.h>
void main()
{
    int start, end, i;
    printf("Enter start and end value: ");
    scanf("%d %d", &start, &end);
    printf("Odd numbers: ");
    for (i = start; i <= end; i++)
    {
        if (i % 2 != 0)
            printf("%d ", i);
    }
    printf("\n");
    printf("Even numbers: ");
    for (i = start; i <= end; i++)
    {
        if (i % 2 == 0)
            printf("%d ", i);
    }
    printf("\n");
}

