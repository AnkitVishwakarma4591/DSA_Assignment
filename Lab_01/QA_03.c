// WAP to calculate Standard Deviation

# include<stdio.h>
# include<math.h>

int main(){
	int size;
	printf("Enter size of an array : ");
	scanf("%d",&size);
	int array[size];
	for(int i=0 ; i<size ; i++){
		printf("Enter %d number : ",i+1);
		scanf("%d",&array[i]);
	}
	float sum = 0.0;
	for(int i=0 ; i<size ; i++){
		sum+=array[i];
	}
	int mean = sum/size;
	
	float sumOfsquare = 0.0;
	for(int i=0 ; i<size ; i++){
		sumOfsquare += pow(array[i] - mean ,2);
	}
	double Std_Deviation = sqrt(sumOfsquare/size);
	printf("Standard Deviation = %.2f", Std_Deviation);
    
	
	return 0;

}