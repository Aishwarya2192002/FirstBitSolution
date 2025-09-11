#include <stdio.h>
#include <string.h>
#define MAX 100
typedef struct 
{
    int taskid;
    char taskdescription[50];
    char status[50];
} Task;
void AddDetail(Task tasks[], int *count);
void UpdateDetail(Task tasks[], int count);
void DisplayDetail(Task tasks[], int count);
int main()
{
    Task tasks[MAX];
    int count = 0;
    int choice;
    do {
        printf("\n1. Add detail\n");
        printf("2. Update detail\n");
        printf("3. Display detail\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch (choice) {
            case 1:
                AddDetail(tasks, &count);
                break;
            case 2:
                UpdateDetail(tasks, count);
                break;
            case 3:
                DisplayDetail(tasks, count);
                break;
            case 4:
                printf("Exiting\n");
                break;
            default:
                printf("Invalid choice\n");
        }
    } while (choice != 4);
    return 0;
}
void AddDetail(Task tasks[], int *count)
{
    if (*count >= MAX) 
	{
        printf("Database full\n");
        return;
    }
    Task t;
    printf("Enter task id: ");
    scanf("%d", &t.taskid);
    printf("Enter task description: ");
    scanf(" %s", t.taskdescription);  
    printf("Enter task status: ");
    scanf(" %s", t.status);
    tasks[*count] = t;
    (*count)++;
    printf("Task added successfully\n");
}
void UpdateDetail(Task tasks[], int count) 
{
    if (count == 0) 
	{
        printf("No tasks to update!\n");
        return;
    }
    int id, i, found = 0;
    printf("Enter task id to update: ");
    scanf("%d", &id);
    for (i = 0; i < count; i++)
	{
        if (tasks[i].taskid == id) 
		{
            printf("Enter new description: ");
            scanf(" %s", tasks[i].taskdescription);
            printf("Enter new status: ");
            scanf(" %s", tasks[i].status);
            printf("Task updated successfully!\n");
            found = 1;
            break;
        }
    }
    if (!found) 
	{
        printf("Task with id %d not found!\n", id);
    }
}
void DisplayDetail(Task tasks[], int count)
{
	int i;
    if (count == 0) 
	{
        printf("No tasks in database\n");
        return;
    }

    printf("\n%s %s %s\n", "Task ID", "Description", "Status");
    for ( i = 0; i < count; i++) 
	{
        printf("%d %s %s\n",
               tasks[i].taskid,
               tasks[i].taskdescription,
               tasks[i].status);
    }
}

