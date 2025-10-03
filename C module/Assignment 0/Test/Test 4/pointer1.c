#include <stdio.h>
void factorial(int *num);   
void main()
{
    int start, end, i;
    int *ptr;
    printf("Enter start  range: ");
    scanf("%d", &start);
    printf("Enter end  range: ");
    scanf("%d", &end);
    for (i = start; i <= end; i++)
    {
        ptr = &i;         
        factorial(ptr);     
    }
}
void factorial(int *num)
{
    int j;
    printf("Factors is %d: ", *num);
    for (j = 1; j <= *num; j++)
    {
        if (*num % j == 0)
        {
            printf("%d ", j);
        }
    }
    printf("\n");
}

