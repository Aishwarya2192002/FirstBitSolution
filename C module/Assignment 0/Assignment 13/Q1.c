#include<stdio.h>
#include<string.h>
struct Student
{
	int RollNo;
	char Name[20];
	int Marks;
};
void main()
{
	struct Student s1;
	s1.RollNo=1;
	strcpy(s1.Name,"Reva");
	s1.Marks=87;
	printf("RollNo:%d\n",s1.RollNo);
	printf("Name:%s\n",s1.Name);
	printf("Marks:%d\n",s1.Marks);
}
