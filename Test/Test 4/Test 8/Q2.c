#include <stdio.h>
#include <string.h>
void reverseString(char str[]) {
    int i, j;
    char temp;
    int len = strlen(str);
    for (i = 0, j = len - 1; i < j; i++, j--) {
        temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}
void main() 
{
    char s[100];
    printf("Enter a string: ");
    scanf("%s", s);   
    reverseString(s);
    printf("Reversed string: %s\n", s);
}

