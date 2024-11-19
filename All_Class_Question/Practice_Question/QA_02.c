// WAP to Find the largest element of an array.
# include<stdio.h>

int main(){
    int size;
    printf("Enter Size of an array : ");
    scanf("%d",&size);
    int Number[size];
    for(int i=0 ; i<size ; i++){
        printf("Enter %d number : ", i);
        scanf("%d",&Number[i]);
    }
    int max = Number[0];
    for(int i=0;i<size ; i++){
        if(Number[i] > max){
            max = Number[i];
        }
    }
    printf("Largest number : %d",max);

    return 0 ;
}