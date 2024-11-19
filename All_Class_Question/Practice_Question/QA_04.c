// WAP add two matrix using multi-dimensional arrays

# include<stdio.h>

int main(){
	int row,col;
	printf("Enter matrix order \n");
	printf("Enter row : ");
	scanf("%d",&row);
	printf("Enter Col : ");
	scanf("%d",&col);

	printf("Matrix 01\n");
	int matrix1[row][col];
	for(int i=0 ; i<row ;i++){
		for(int j=0 ; j<col ; j++){
			printf("Enter element (%d,%d) : ",i+1,j+1);
			scanf("%d",&matrix1[i][j]);
		}
	}
	printf("matrix 02\n");
	int matrix2[row][col];
	for(int i=0 ; i<row ;i++){
		for(int j=0 ; j<col ; j++){
			printf("Enter element (%d,%d) : ",i+1,j+1);
			scanf("%d",&matrix2[i][j]);
		}
	}

	int sum_matrix[row][col];
	for(int i=0 ; i<row ;i++){
		for(int j=0 ; j<col ; j++){
			sum_matrix[i][j] = matrix1[i][j] + matrix2[i][j];
		}
	}

	printf("Sum of the two matrices : ");
	for(int i=0 ; i<row ;i++){
		for(int j=0 ; j<col ; j++){
			printf("%d ",sum_matrix[i][j]);
		}
		printf("\n");
	}
	return 0 ;
	
}