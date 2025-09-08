#include<stdio.h>
typedef struct
{
	char name[50];
	int match;
	int runs;
	int wickets;
	
}player;
void acceptPlayer(player players[],int n);
void displayPlayer(player players[],int n);
void displayMax(player playesr[],int n);
void main()
{
	player players[10];
	int n=10;
	acceptPlayer(players,n);
	displayPlayer(players,n);
	displayMax(players,n);
	
}
void acceptPlayer(player players[],int n)
{
	int i;
	for(i=0;i<n;i++)
	{
		printf("Enter Name:");
		scanf("%s",&players[i].name);
		printf(" Matches Played:");
		scanf("%d",&players[i].match);
		printf("Runs:");
		scanf("%d",&players[i].runs);
		printf("Wickets:");
		scanf("%d",&players[i].wickets);
		
	}
}
void displayPlayer(player players[],int n)
{
	int i;
	for(i=0;i<n;i++)
	{
		printf("%s\n%d\n%d\n%d\n",players[i].name,players[i].match,players[i].runs,players[i].wickets);
	}
}
void displayMax(player players[],int n)
{
	int maxRun=0,maxWicket=0;
	int i;
	for(i=0;i<n;i++)
	{
		if(players[i].runs >players[maxRun].runs)
		{
			maxRun=i;
		}
		if(players[i].wickets >players[maxWicket].wickets)
		{
			maxWicket=i;
		}
	}
	printf("Player Maximum Runs:%s-%d\n",players[maxRun].name,players[maxRun].runs);
	printf("Player Maximum Wickets:%s-%d",players[maxWicket].name,players[maxWicket].wickets);

}







