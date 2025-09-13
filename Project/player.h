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
void AddPlayer(player **players,int* ,int* );
void RemovePlayer(player *players,int* );
void SearchPlayer(player *players,int );
void UpdatePlayer(player *players,int );
void DisplayAllPlayer(player *players,int );
void DisplaySortByRuns(player *players,int ,int );
void DisplaySortByWickets(player *players,int ,int );
void DisplayTop3(player *players,int );
