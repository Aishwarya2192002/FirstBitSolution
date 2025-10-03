#include <stdio.h>
void main()
{
    int h, m, s, total;
    printf("Enter time (hh mm ss): ");
    scanf("%d %d %d", &h, &m, &s);
    total = h * 3600 + m * 60 + s;
    printf("Total Seconds = %d\n", total);
}

