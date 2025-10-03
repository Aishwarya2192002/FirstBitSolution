#include <stdio.h>
int main()
{
    int arr[50], n, x, y, temp, i;
    printf("Enter number of elements: ");
    scanf("%d", &n);
    printf("Enter %d elements:\n", n);
    for (i = 0; i < n; i++) 
	{
        scanf("%d", &arr[i]);
    }
    printf("Enter position x: ");
    scanf("%d", &x);
    printf("Enter position y: ");
    scanf("%d", &y);
    if (x >= 1 && x <= n && y >= 1 && y <= n)
	{
        temp = arr[x - 1];
        arr[x - 1] = arr[y - 1];
        arr[y - 1] = temp;
        printf("Array after swapping:\n");
        for (i = 0; i < n; i++)
		{
            printf("%d ", arr[i]);
        }
        printf("\n");
    } else 
	{
        printf("Invalid positions!\n");
    }
    return 0;
}

