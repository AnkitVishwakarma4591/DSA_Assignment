// WAP to find the number of vowels, consonants, digits and white space in a string

# include <stdio.h>
# include <ctype.h>

void countCharacter(char str[]);

int main(){
    char str[200];
    printf("Enter String : ");
    fgets(str,200,stdin);

    countCharacter(str);

    return 0;
}
void countCharacter(char str[]){
    int vowels = 0;
    int consonants = 0;
    int digits = 0; 
    int whiteSpace = 0; 
    for(int i=0;str[i] != '\0' ; i++){
        char ch = tolower(str[i]);
        if(str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u'){
            vowels++;
        }
        else if(ch >= 'a' && ch<='z'){
            consonants++;
        }
        else if(isdigit(ch)){
            digits++;
        }
        else if(ch == ' '){
            whiteSpace++;
        }
    }
    printf("Vowels : %d \n",vowels);
    printf("Consonants : %d \n",consonants);
    printf("Digits : %d \n",digits);
    printf("WhiteSpace : %d \n",whiteSpace);
}


