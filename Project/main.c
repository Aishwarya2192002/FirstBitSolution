#include<stdio.h>
#include<stdlib.h>
#include "player.h"
int main()
{
	int choice;
	int count=0;
	int size;
	player *players;
	printf("Enter Size of Player:");
	scanf("%d",&size);
	players=(player *)malloc(size * sizeof(player));//malloc allocate memory for size of player
	if(players==NULL)
	{
		printf("failed");
		return 1;
	}
	while(1)
	{
		printf("\n----Player Management System-----\n");
        printf("1.Add Player\n");
        printf("2.Remove Player\n");
        printf("3.Search Player\n");
        printf("4.Update Player\n");
        printf("5.Display All Players\n");
        printf("6.Display Players Sorted by Runs\n");
        printf("7.Display Players Sorted by Wickets\n");
        printf("8.Display Top 3 Players \n");
        printf("9.Exit\n");
        printf("---------------------------------------\n");
        printf("Enter your choice:");
        scanf("%d",&choice);
        
        switch(choice)
        {
        	case 1:
        		AddPlayer(&players,&count,&size);
        		break;
        	case 2:
        		RemovePlayer(players,&count);
        		break;
        	case 3:
               SearchPlayer(players, count);
               break;
            case 4:
                UpdatePlayer(players, count);
                break;
            case 5:
                DisplayAllPlayer(players, count);
                break;
            case 6:
			{
                int order;
                printf("1. Ascending\n2. Descending\nEnter order: ");
                scanf("%d", &order);
                DisplaySortByRuns(players, count, order);
                break;
            }
            case 7: 
			{
              int order;
              printf("1. Ascending\n2. Descending\nEnter order: ");
              scanf("%d", &order);
              DisplaySortByWickets(players, count, order);
              break;
           }
           case 8:
              DisplayTop3(players, count);
              break;
           case 9:
              printf("Exit Program...\n");
              free(players);
              exit(0);
            default:
              printf("Invalid choice...\n");
        }
	}      
    return 0;
}
