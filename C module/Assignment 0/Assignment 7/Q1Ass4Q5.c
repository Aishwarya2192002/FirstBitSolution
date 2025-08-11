#include <stdio.h>
void check(int *num);
void main() 
{
	int num;
	printf("Enter a number: ");
    scanf("%d", &num);
   check(&num);
}
void check(int *num)
{
    int i, flag, temp, digit, rev, sum,choice;
    while (1) 
	{  
        printf("\nMenu:\n");
        printf("1. Check Even or Odd\n");
        printf("2. Check Prime or Not\n");
        printf("3. Check Palindrome or Not\n");
        printf("4. Check Positive, Negative or Zero\n");
        printf("5. Reverse the Number\n");
        printf("6. Find Sum of Digits\n");
        printf("7. Exit\n");
         printf("Enter your choice: ");
         scanf("%d", &choice);

        if (choice == 1) 
		{ 
            if (*num % 2 == 0)
                printf("%d is Even\n", *num);
            else
                printf("%d is Odd\n", *num);
        } 
        else if (choice == 2) 
		{ 
            if (*num <= 1) 
			{
                printf("%d is not Prime\n", *num);
            }
			else 
		    {
                flag = 1;
                for (i = 2; i <= *num / 2; i++)
				{
                    if (*num % i == 0) 
					{
                        flag = 0;
                        break;
                    }
                }
                if (flag == 1)
                    printf("%d is Prime\n", *num);
                else
                    printf("%d is not Prime\n", *num);
            }
        } 
        else if (choice == 3) 
		{
            temp = *num;
            rev = 0;
            while (temp > 0) 
			{
                digit = temp % 10;
                rev = rev * 10 + digit;
                temp /= 10;
            }
            if (rev == *num)
                printf("%d is Palindrome\n", *num);
            else
                printf("%d is not Palindrome\n", *num);
        } 
        else if (choice == 4) 
		{ 
            if (*num > 0)
                printf("%d is Positive\n", *num);
            else if (*num < 0)
                printf("%d is Negative\n", *num);
            else
                printf("Number is Zero\n");
        } 
        else if (choice == 5) 
		{ 
            temp = *num;
            rev = 0;
            while (temp > 0) 
			{
                digit = temp % 10;
                rev = rev * 10 + digit;
                temp /= 10;
            }
            printf("Reverse of %d is %d\n", *num, rev);
        } 
        else if (choice == 6) 
		{ 
            temp = *num;
            sum = 0;
            while (temp > 0) 
			{
                digit = temp % 10;
                sum += digit;
                temp /= 10;
            }
            printf("Sum of digits of %d is %d\n", *num, sum);
        } 
        else if(choice == 7)  
		{
			printf("Exit \n");
			break;
		} 
		else
		{
			printf("invalid choice \n");
		}
    }
}
