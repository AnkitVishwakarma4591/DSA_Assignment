// WAP to Concatenate two string.

# include <stdio.h>
# include <string.h>

int main(){
    char str1[200];
    char str2[100];
    printf("Enter 1st String :");
    fgets(str1,200,stdin);
    printf("Enter 2nd String :");
    fgets(str2,200,stdin);

    strcat(str1,str2);

    printf("On concatenating two string %s",str1);
    return 0;
}