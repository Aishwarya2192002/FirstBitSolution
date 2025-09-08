#include <stdio.h>
#include <string.h>
#define MAX 100   // maximum movies

typedef struct {
    char title[50];
    char director[50];
    int releaseYear;
    char genre[30];
} Movie;

void AddMovie(Movie movies[], int *count);
void RemoveMovie(Movie movies[], int *count);
void SearchMovie(Movie movies[], int count);
void DisplayMovies(Movie movies[], int count);
void UpdateMovie(Movie movies[], int count);

int main() {
    Movie movies[MAX];
    int count = 0;
    int choice;

    do {
        printf("1. Add Movie\n");
        printf("2. Remove Movie\n");
        printf("3. Search Movie\n");
        printf("4. Update Movie\n");
        printf("5. Display All Movies\n");
        printf("6. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        getchar(); 
        switch(choice) {
            case 1: AddMovie(movies, &count); break;
            case 2: RemoveMovie(movies, &count); break;
            case 3: SearchMovie(movies, count); break;
            case 4: UpdateMovie(movies, count); break;
            case 5: DisplayMovies(movies, count); break;
            case 6: printf("Exiting...\n"); break;
            default: printf("Invalid choice! Try again.\n");
        }
    } while(choice != 6);

    return 0;
}
void AddMovie(Movie movies[], int *count) {
    if (*count >= MAX) {
        printf("Database full, cannot add more movies!\n");
        return;
    }

    Movie m;
    printf("Enter Title: ");
    scanf("%s",m.title);
    // avoid duplicate title
    int i;
    for (i = 0; i < *count; i++) {
        if (strcmp(movies[i].title, m.title) == 0) {
            printf("Movie already exists!\n");
            return;
        }
    }

    printf("Enter Director: ");
    scanf("%s",m.director);
    printf("Enter Release Year: ");
    scanf("%d", &m.releaseYear);
    printf("Enter Genre: ");
    scanf("%s",m.genre);
    movies[*count] = m;
    (*count)++;
    printf("Movie added successfully!\n");
}

void RemoveMovie(Movie movies[], int *count) {
    char title[50];
    printf("Enter Title to remove: ");
    scanf("%s",title);

    int flag = -1;
    int i;
    for ( i = 0; i < *count; i++) {
        if (strcmp(movies[i].title, title) == 0) {
            flag = i;
            break;
        }
    }

    if (flag == -1) {
        printf("Movie not found!\n");
        return;
    }
    for (i = flag; i < *count - 1; i++) {
        movies[i] = movies[i + 1];
    }
    (*count)--;

    printf("Movie removed successfully!\n");
}

void SearchMovie(Movie movies[], int count) {
    int choice;
    printf("Search by:\n1. Title\n2. Director\nEnter choice: ");
    scanf("%d", &choice);
    getchar();

    if (choice == 1) {
        char title[50];
        printf("Enter Title: ");
        fgets(title, sizeof(title), stdin);
        title[strcspn(title, "\n")] = '\0';
        int i;
        for (i = 0; i < count; i++) {
            if (strcmp(movies[i].title, title) == 0) {
                printf("Found: %s | Director: %s | Year: %d | Genre: %s\n",
                       movies[i].title, movies[i].director, movies[i].releaseYear, movies[i].genre);
                return;
            }
        }
    } else if (choice == 2) {
        char director[50];
        printf("Enter Director: ");
        scanf("%s",director);
        int i;
        for (i = 0; i < count; i++) {
            if (strcmp(movies[i].director, director) == 0) {
                printf("Found: %s | Director: %s | Year: %d | Genre: %s\n",
                       movies[i].title, movies[i].director, movies[i].releaseYear, movies[i].genre);
                return;
            }
        }
    } else {
        printf("Invalid choice!\n");
        return;
    }
    printf("Movie not found!\n");
}

void UpdateMovie(Movie movies[], int count) {
    char title[50];
    printf("Enter Title of the movie to update: ");
    fgets(title, sizeof(title), stdin);
    title[strcspn(title, "\n")] = '\0';
    int i;
    for (i = 0; i < count; i++) {
        if (strcmp(movies[i].title, title) == 0) {
            printf("Enter new Director: ");
            fgets(movies[i].director, sizeof(movies[i].director), stdin);
            movies[i].director[strcspn(movies[i].director, "\n")] = '\0';

            printf("Enter new Release Year: ");
            scanf("%d", &movies[i].releaseYear);
            getchar();

            printf("Enter new Genre: ");
            fgets(movies[i].genre, sizeof(movies[i].genre), stdin);
            movies[i].genre[strcspn(movies[i].genre, "\n")] = '\0';

            printf("Movie updated successfully!\n");
            return;
        }
    }
    printf("Movie not found!\n");
}

void DisplayMovies(Movie movies[], int count) {
    if (count == 0) {
        printf("No movies in database!\n");
        return;
    }

    printf("\n--- Movie List ---\n");
    int i;
    for ( i = 0; i < count; i++) {
        printf("%d) %s | Director: %s | Year: %d | Genre: %s\n",
               i + 1, movies[i].title, movies[i].director, movies[i].releaseYear, movies[i].genre);
    }
}

