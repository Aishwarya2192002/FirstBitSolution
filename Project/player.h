#pragma once
typedef struct Player
{
	int jerseynum;
	char name[50];
	int runs;
	int wickets;
	int matches;
}player;

//function declaration
void AddPlayer(player **players,int *count,int *size);
void RemovePlayer(player *players,int *count);
void SearchPlayer(player *players,int count);
void UpdatePlayer(player *players,int count);
void DisplayAllPlayer(player *players,int count);
void DisplaySortByRuns(player *players,int count,int order);
void DisplaySortByWickets(player *players,int count,int order);
void DisplayTop3(player *players,int count);
