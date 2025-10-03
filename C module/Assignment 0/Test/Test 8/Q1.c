#include <stdio.h>
#include <stdlib.h>
#include <string.h>
void main()
{
    char userid[30], password[30];
    char correctUser[] = "admin";
    char correctPass[] = "1234";
    int randomNum = 654321;   
    int enteredNum;
    printf("Enter user id: ");
    scanf("%s", userid);
    printf("Enter password: ");
    scanf("%s", password);
    if (strcmp(userid, correctUser) == 0 && strcmp(password, correctPass) == 0)
	{
        printf("\nNumber is: %d\n", randomNum);
        printf("Re-enter the same number: ");
        scanf("%d", &enteredNum);

        if (enteredNum == randomNum)
            printf("\nLogin Success!\n");
        else
            printf("\nVerification Failed!\n");
    } else 
	{
        printf("\nInvalid UserID or Password.\n");
    }
}

