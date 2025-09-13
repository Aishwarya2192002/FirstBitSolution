#include <stdio.h>
int isPalindrome(int arr[], int n) 
{
	int i;
    for ( i = 0; i < n / 2; i++) 
	{
        if (arr[i] != arr[n - i - 1])
		{
            return 0;  
        }
    }
    return 1;
}
int main() 
{
    int arr[50], n,i;
    printf("Enter number of elements: ");
    scanf("%d", &n);
    printf("Enter %d elements:\n", n);
    for ( i = 0; i < n; i++) 
	{
        scanf("%d", &arr[i]);
    }
    if (isPalindrome(arr, n))
        printf("The array is a palindrome.\n");
    else
        printf("The array is NOT a palindrome.\n");

    return 0;
}

