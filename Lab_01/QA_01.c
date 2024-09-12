// WAP to calculate average using arrays
# include <stdio.h>

int main(){
    int size;
    printf("Enter Size of an array : ");
    scanf("%d",&size);
    int array[size];
    int sum = 0;
    for(int i=0;i<size;i++){
        printf("Enter %d number :",i);
        scanf("%d",&array[i]);
        sum+=array[i];
    } 
    int avg = sum/size;
    printf("Average of number : %d",avg);
    
    return 0; 
}