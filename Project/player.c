#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include "player.h"
//add player
void AddPlayer(player **players,int *count,int *size)
{
	int newsize;
	if(*count==*size)//increase size
	{
		printf("Enter size increase:");
		scanf("%d",&newsize);
		*size=*size+newsize;//add newsize
		*players=(player*)realloc(*players,*size * sizeof(player));
		if (*players == NULL) 
		{
            printf("Memory reallocation failed!\n");
            exit(1);
        }
    printf("Increased size %d\n",*size);
	}
	player p;
	printf("Enter Jersey Number:");
	scanf("%d",&p.jerseynum);
	
	int i;
	for(i=0;i < *count;i++)
	{
	
    	if((*players)[i].jerseynum == p.jerseynum)
	   {
		 printf("Jersey Number already exists");
		 return;
	   }
	}
	printf("Enter Name:");
	scanf("%s",p.name);
	printf("Enter Run:");
	scanf("%d",&p.runs);
	printf("Enter Wicket:");
	scanf("%d",&p.wickets);
	printf("Enter Matches Played:");
	scanf("%d",&p.matches);
	(*players)[*count]=p;
	(*count)++;
	printf("player added successfully...");
}
void RemovePlayer(player *players,int *count)
{
	int jersey;
	printf("Enter jersey number:");
	scanf("%d",&jersey);
	int flag=-1;
	int i;
	for(i=0;i<*count;i++)
	{
		if(players[i].jerseynum==jersey)
		{
			flag=i;
			break;
		}
	}
	if(flag==-1)
	{
		printf("Player not found");
		return;
	}
	for(i=flag;i<*count-1;i++)
	{
		players[i]=players[i+1];
	}
	*count--;
	printf("Player remove successfully");
}
void SearchPlayer(player *players,int count)
{
	int option;
	printf("Search by:\n1. Jersey Number\n2.Name\nEnter Choice: ");
	scanf("%d",&option);
	if(option==1)
	{
		int jersey;
		printf("Enter Jersey Number:");
		scanf("%d",&jersey);
	
	  int i;
      for(i=0;i<count;i++)
	  {
		  if(players[i].jerseynum==jersey)
		  {
		     printf("Player Found:%s | Runs:%d | Wickets:%d | Matches:%d\n",players[i].name,players[i].runs,players[i].wickets,players[i].matches);
			 return;
		  }
       }
   }
   else if(option==2)
   {
   	 char name[50];
      printf("Enter Name: ");
      scanf("%s",name);
      
      int i;
      for(i=0;i<count;i++)
      {
   	      if(strcmp(players[i].name,name)==0)
   	      {
   	  	     printf("Player Found:%d | Runs:%d | Wickets:%d | Matches:%d\n",players[i].jerseynum,players[i].runs,players[i].wickets,players[i].matches);
             return;
	      }
       }
   }
   else
   {
   	  printf("Invalid choice");
   	  return;
   }
   
   printf("Player Not Found");
}
void UpdatePlayer(player *players,int count)
{
    int jersey;
    printf("Enter Jersey Number to update: ");
    scanf("%d",&jersey);

    int i;
    for(i=0;i<count;i++)
    {
        if(players[i].jerseynum == jersey)
        {
            int choice;
            printf("\nWhat do you want to update?\n");
            printf("1. Runs\n");
            printf("2. Wickets\n");
            printf("3. Matches\n");
            printf("4. Name\n");
            printf("Enter your choice: ");
            scanf("%d",&choice);

            switch(choice)
            {
                case 1:
                    printf("Enter new Runs: ");
                    scanf("%d",&players[i].runs);
                    break;
                case 2:
                    printf("Enter new Wickets: ");
                    scanf("%d",&players[i].wickets);
                    break;
                case 3:
                    printf("Enter new Matches: ");
                    scanf("%d",&players[i].matches);
                    break;
                case 4:
                    printf("Enter new Name: ");
                    scanf("%s",players[i].name);
                    break;
                default:
                    printf("Invalid choice!\n");
                    return;
            }

            printf(" Player Updated Successfully!\n");
            return;
        }
    }

    printf("Player Not Found\n");
}

void DisplayAllPlayer(player *players,int count)
{
	if(count==0)
	{
		printf("No Player Available");
		return;
	}
	printf("\nJersey\tName\tRuns\tWickets\tMatches\n");
	printf("----------------------------------------\n");
	
	int i=0;
	for(i=0;i<count;i++)
	{
		printf("%d\t%s\t%d\t%d\t%d\n",players[i].jerseynum,players[i].name,players[i].runs,players[i].wickets,players[i].matches);
	}
}
void DisplaySortByRuns(player *players,int count,int order)
{
	int i,j;
	for(i=0;i<count-1;i++)
	{
		for(j=0;j<count-i-1;j++)
		{
			if((order==1&&players[j].runs>players[j+1].runs)||(order==2&&players[j].runs<players[j+1].runs))
			{
				player temp=players[j];
				players[j]=players[j+1];
				players[j+1]=temp;
			}
		}
	}
	printf("Players sorted by Runs");
	DisplayAllPlayer(players,count);
}
void DisplaySortByWickets(player *players,int count,int order)
{
	int i,j;
	for(i=0;i<count-1;i++)
	{
		for(j=0;j<count-i-1;j++)
		{
			if((order==1&&players[j].wickets>players[j+1].wickets)||(order==2&&players[j].wickets<players[j+1].wickets))
			{
				player temp=players[j];
				players[j]=players[j+1];
				players[j+1]=temp;
			}
		}
	}
	printf("Players sorted by Wickets");
	DisplayAllPlayer(players,count);
}
void DisplayTop3(player *players,int count)
{
	if(count==0)
	{
		printf("Player not available");
		return;
	}
	int i,j;
	for(i=0;i<count-1;i++)
	{
		for(j=0;j<count-i-1;j++)
		{
			if(players[j].runs<players[j+1].runs)
			{
				player temp=players[j];
				players[j]=players[j+1];
				players[j+1]=temp;
			}
		}
	}
	printf("\nTop 3 Players By Runs:\n");
	for(i=0;i<count && i<3;i++)
	{
		printf("%s(Runs:%d)\n",players[i].name,players[i].runs);
	}
	for(i=0;i<count-1;i++)
	{
		for(j=0;j<count-i-1;j++)
		{
			if(players[j].wickets < players[j+1].wickets)
			{
				player temp=players[j];
				players[j]=players[j+1];
				players[j+1]=temp;
			}
		}
	}
	printf("\nTop 3 Players By Wickets:\n");
	for(i=0;i<count && i<3;i++)
	{
		printf("%s(Wickets:%d)\n",players[i].name,players[i].wickets);
	}
}

