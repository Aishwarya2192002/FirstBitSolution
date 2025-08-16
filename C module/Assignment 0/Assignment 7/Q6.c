#include <stdio.h>
void main()
{
    int arr[10], size, i, j, flag;
    printf("Enter size of array: ");
    scanf("%d", &size);
    printf("Enter %d elements:\n", size);
    for(i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }
    printf("Prime numbers in the array are:\n");
    for(i = 0; i < size; i++)
    {
        if(arr[i] < 2)
            continue;   

        flag = 1;  
        for(j = 2; j <= arr[i]/2; j++)
        {
            if(arr[i] % j == 0)
            {
                flag = 0;   
                break;
            }
        }
        if(flag == 1)
        {
            printf("%d ", arr[i]);
        }
    }
}

