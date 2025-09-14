#include <stdio.h>
float deposit(float balance, float amount);
float withdraw(float balance, float amount);
void main()
{
    float balance, amount;
    int choice;
    printf("Enter initial amount in your account: ");
    scanf("%f", &balance);
    printf("\n1. Deposit\n2. Withdraw\nEnter your choice: ");
    scanf("%d", &choice);
    if (choice == 1)
    {
        printf("Enter amount to deposit: ");
        scanf("%f", &amount);
        balance = deposit(balance, amount);
    }
    else if (choice == 2)
    {
        printf("Enter amount to withdraw: ");
        scanf("%f", &amount);
        balance = withdraw(balance, amount);
    }
    else
    {
        printf("Invalid choice!\n");
    }

    printf("Updated Balance = %.2f\n", balance);
}

float deposit(float balance, float amount)
{
    balance =balance+ amount;
    return balance;
}

float withdraw(float balance, float amount)
{
    if (balance < 3000)
    {
        printf("Can't withdraw. Balance is less than 3000.\n");
    }
    else if (amount > balance)
    {
        printf("Insufficient funds to withdraw.\n");
    }
    else
    {
        balance =balance- amount;
        printf("Withdrawal successful.\n");
    }
    return balance;
}

