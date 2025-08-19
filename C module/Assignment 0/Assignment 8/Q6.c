#include <stdio.h>
void prime(int *arr,int size);
void main()
{
    int arr[10], size, i;
    printf("Enter size of array: ");
    scanf("%d", &size);
    printf("Enter %d elements:\n", size);
    for(i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }
    prime (arr,size);
}
void prime(int *arr,int size)
{
	int i,j,flag;
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

