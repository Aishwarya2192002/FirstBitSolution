#include <stdio.h>
void convertminutes(int *totalMinutes, int *hours, int *remainingMinutes); 
void main()
 {
    int minutes, hrs, remMins;
    printf("Enter total minutes: ");
    scanf("%d", &minutes);
    convertminutes(&minutes, &hrs, &remMins); 
    printf("%d minutes = %d hours and %d minutes\n", minutes, hrs, remMins);
}

void convertminutes(int *totalMinutes, int *hours, int *remainingMinutes) {
    *hours = *totalMinutes / 60;       
    *remainingMinutes = *totalMinutes % 60; 
}

