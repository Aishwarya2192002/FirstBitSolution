#include <stdio.h>
#include <string.h>   

int main() {
    char str[100];
    int i, len, flag = 1;
    printf("Enter a String:");
	scanf("%[^\n]s", str);
    len = strlen(str);  
    for (i = 0; i < len / 2; i++) {
        if (str[i] != str[len - i - 1]) {
            flag = 0; 
            break;
        }
    }
    if (flag == 1)
        printf("The string is a Palindrome.\n");
    else
        printf("The string is NOT a Palindrome.\n");
}

