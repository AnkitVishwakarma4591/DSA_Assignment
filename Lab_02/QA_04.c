// WAP to find the length of a string.

# include <stdio.h>
# include <string.h>

int main(){
    char str[100];
    printf("Enter any String to count length : ");
    fgets(str,200,stdin);

    int len = strlen(str);

    printf("Length of String is %d ",len-1);

    return 0;
}