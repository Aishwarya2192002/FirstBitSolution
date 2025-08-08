#include<stdio.h>
void main()
{
    int no;
    printf("Enter number:");
    scanf("%d", &no);
    for(int i=1;i<=no;i++)
    {
        for (int j = 1; j<=no-i+1; j++)
        {
            printf("*");
        }
        printf("\n");
    }
}