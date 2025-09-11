#include <stdio.h>
void main() 
{
    char str[100], ch, sym;
    int i;
    printf("Enter a string: ");
    scanf("%s", str);   
    printf("Enter the character to replace: ");
    scanf(" %c", &ch);
    printf("Enter the special symbol: ");
    scanf(" %c", &sym);
    for (i = 0; str[i] != '\0'; i++) 
	{
        if (str[i] == ch)
		{
            str[i] = sym;
        }
    }
    printf("Modified string: %s\n", str);
}

