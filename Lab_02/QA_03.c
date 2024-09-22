// WAP to remove all characters in a string except alphabet
#  include <stdio.h>
# include<string.h>
# include<ctype.h>

int main(){
    char str[200], result[200];
    printf("Enter string : ");
    fgets(str,200,stdin);

    int j=0;
    for(int i=0 ; str[i] != '\0' ;i++){
        if(isalpha(str[i])){
            result[j++] = str[i];
        }
    }
    result[j] = '\0';
    printf("String after removing non-alphabet characters: %s \n",result);

    return 0;
}
