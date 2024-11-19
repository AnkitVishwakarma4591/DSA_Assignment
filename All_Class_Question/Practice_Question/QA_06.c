// WAP to find Frequency of character in a string .

#include <stdio.h>
#include <string.h>

int main() {
    char str[100];
    int freq[256] = {0}; // Array to store the frequency of characters
    
    // Input the string
    printf("Enter a string: ");
    gets(str);

    // Calculate the frequency of each character
    for(int i = 0; str[i] != '\0'; i++) {
        freq[(int)str[i]]++;
    }

    // Print the frequency of each character
    printf("Character frequencies:\n");
    for(int i = 0; i < 256; i++) {
        if(freq[i] != 0) {
            printf("%c: %d\n", i, freq[i]);
        }
    }

    return 0;
}
