// WAP to store information(name,roll and marks) of a students using a structure.

# include <stdio.h>

struct Student{
	char name[200];
	int roll;
	float marks;
};

int main(){
	int size;
	printf("Enter strenth of Students :");
	scanf("%d",&size);
	struct Student s[size];
	for(int i=0;i<size;i++){

		getchar();
		printf("Enter details of Students %d \n",i+1);
		printf("Enter Name : ");
		fgets(s[i].name,sizeof(s[i].name),stdin);
		printf("Enter roll no. : ");
		scanf("%d",&s[i].roll);
		printf("Enter Marks : ");
		scanf("%f",&s[i].marks);
		printf("\n");

		
	}

	for(int i=0;i<size;i++){
		printf("\nDetails of Student : %d\n",i+1);
		printf("Name : %s",s[i].name);
		printf("Roll_no. : %d\n",s[i].roll);
		printf("Marks : %.2f\n",s[i].marks);
		
	}	
	
	return 0;
}