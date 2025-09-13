#include<stdio.h>
#include<stdlib.h>
#include<string.h>
typedef struct Player
{
	int jerseynum;
	char name[50];
	int runs;
	int wickets;
	int matches;
}player;

player *players=NULL;
int count =0;
int size=0;
//function declaration
void AddPlayer();
void RemovePlayer();
void SearchPlayer();
void UpdatePlayer();
void DisplayAllPlayer();
void DisplaySortByRuns(int);
void DisplaySortByWickets(int);
void DisplayTop3();
int main()
{
	int choice;
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
        
        if(choice==1)
        {
        	AddPlayer();
		}
		else if(choice==2)
		{
			RemovePlayer();
		}
		else if(choice==3)
		{
			SearchPlayer();
		}
		else if(choice==4)
		{
			UpdatePlayer();
		}
		else if(choice==5)
		{
			DisplayAllPlayer();
		}	
    	else if (choice==6) 
		{
            int order;
            printf("1. Ascending \n 2. Descending \n Enter order: ");
            scanf("%d", &order);
            DisplaySortByRuns(order);
        }
        else if(choice==7)
        {
        	int order;
        	printf("1. Ascending \n 2. Descending \n Enter order: ");
            scanf("%d", &order);
            DisplaySortByWickets(order);
		}
		else if(choice==8)
		{
			DisplayTop3();
		}
		else if(choice==9)
		{
			printf("Exit Program...");
			free(players);
			exit(0);
		}
		else 
		{
			printf("Invalid choice...");
		}
    }
    return 0;
}
//add player
void AddPlayer()
{
	int newsize;
	if(count==size)//increase size
	{
		printf("Enter size increase:");
		scanf("%d",&newsize);
		size=size+newsize;//add newsize
		players=(player*)realloc(players,size * sizeof(player));
		if (players == NULL) 
		{
            printf("Memory reallocation failed!\n");
            exit(1);
        }
    printf("Increased size %d\n",size);
	}
	player p;
	printf("Enter Jersey Number:");
	scanf("%d",&p.jerseynum);
	getchar();
	//duplicate jerseynum avoid
	int i;
	for(i=0;i < count;i++)
	if(players[i].jerseynum == p.jerseynum)
	{
		printf("Jersey Number already exists");
		return;
	}
	printf("Enter Name:");
	fgets(p.name, sizeof(p.name), stdin);//use allow space
	p.name[strcspn(p.name, "\n")] = '\0';//remove character
	printf("Enter Run:");
	scanf("%d",&p.runs);
	printf("Enter Wicket:");
	scanf("%d",&p.wickets);
	printf("Enter Matches Played:");
	scanf("%d",&p.matches);
	players[count]=p;
	count++;
	printf("player added successfully...");
}
void RemovePlayer()
{
	int jersey;
	printf("Enter jersey number:");
	scanf("%d",&jersey);
	int flag=1;
	int i;
	for(i=0;i<count;i++)
	{
		if(players[i].jerseynum==jersey)
		{
			flag=i;
			break;
		}
	}
	if(flag==1)
	{
		printf("Player not found");
		return;
	}
	for(i=flag;i<count-1;i++)
	{
		players[i]=players[i+1];
	}
	count--;
	printf("Player remove successfully");
}
void SearchPlayer()
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
     getchar(); 
      printf("Enter Name: ");
      fgets(name, sizeof(name), stdin);
      name[strcspn(name, "\n")] = '\0';
      
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
void UpdatePlayer()
{
	int jersey;
	printf("Enter jersey Number to update:");
	scanf("%d",&jersey);
	
	int i;
	for(i=0;i<count;i++)
	{
		if((players[i].jerseynum)==jersey)
		{
			printf("Enter new Run:");
			scanf("%d",&players[i].runs);
			printf("Enter new wickets:");
			scanf("%d",&players[i].matches);
			printf("Enter new Matches:");
			scanf("%d",&players[i].matches);
			printf("Player Updated Successfully");
            return;
		}
	}
	printf("Player Not Found");
}
void DisplayAllPlayer()
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
void DisplaySortByRuns(int order)
{
	int i,j;
	for(i=0;i<count-1;i++)
	{
		for(j=0;j<count-i-1;i++)
		{
			if((order==1&&players[i].runs>players[j+1].runs)||(order==2&&players[i].runs<players[j+1].runs))
			{
				player temp=players[j];
				players[j]=players[j+1];
				players[j+1]=temp;
			}
		}
	}
	printf("Players sorted by Runs");
	DisplayAllPlayer();
}
void DisplaySortByWickets(int order)
{
	int i,j;
	for(i=0;i<count-1;i++)
	{
		for(j=0;j<count-i-1;i++)
		{
			if((order==1&&players[i].wickets>players[j+1].wickets)||(order==2&&players[i].wickets<players[j+1].wickets))
			{
				player temp=players[j];
				players[j]=players[j+1];
				players[j+1]=temp;
			}
		}
	}
	printf("Players sorted by Wickets");
	DisplayAllPlayer();
}
void DisplayTop3()
{
	if(count==0)
	{
		printf("Player not available");
		return;
	}
	int i,j;
	for(i=0;i<count-1;i++)
	{
		for(j=0;j<count-i-1;i++)
		{
			if(players[j].runs)
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
		for(j=0;j<count-i-1;i++)
		{
			if(players[j].wickets)
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
		printf("%s(Runs:%d)\n",players[i].name,players[i].wickets);
	}
}












