# include <iostream>
using namespace std;

int main(){
    int row1,col1,row2,col2;
    cout<<"Enter elements for Matrix1 :"<<endl;
    cout<<"Enter row1 :";
    cin>>row1;
    cout<<"Enter col1 :";
    cin>>col1;
    cout<<"Enter elements for Matrix2 :"<<endl;
    cout<<"Enter row2 :";
    cin>>row2;
    cout<<"Enter col2 :";
    cin>>col2;
    int matrix1[row1][col1];
    int matrix2[row2][col2];
    int result[row1][col2];

    if(col1 != row2){
        cout<<"Matrix multiplication not possible. Number of columns in the first matrix must be equal to the number of rows in the second matrix."<<endl;
        
    }

    cout<<"Enter element in matrix 1 : "<<endl;
    for(int i=1;i<=row1;i++){
        for(int j=1;j<=col1;j++){
            cout<<"Enter element ("<<i<<","<<j<<") :";
            cin>>matrix1[i][j];
        }
    }
    cout<<"Enter element in matrix 2 : "<<endl;
    for(int i=1;i<=row2;i++){
        for(int j=1;j<=col2;j++){
            cout<<"Enter element ("<<i<<","<<j<<") :";
            cin>>matrix2[i][j];
        }
    }
    for(int i=1;i<=row1;i++){
        for(int j=1;j<=col2;j++){
            result[i][j]=0;
        }
    }

    for (int i = 1; i <= row1; i++) {
        for (int j = 1; j <=col2; j++) {
            for (int k = 1; k <= col1; k++) {
                result[i][j] += matrix1[i][k] * matrix2[k][j];
            }
        }
    }

    cout<<"Matrix 1 :"<<endl;
    for(int i=1;i<=row1;i++){
        for(int j=1;j<=col1;j++){
            cout<<matrix1[i][j];
        }
        cout<<"\n";
    }

    cout<<"Matrix 2 :"<<endl;
    for(int i=1;i<=row2;i++){
        for(int j=1;j<=col2;j++){
            cout<<matrix2[i][j];
        }
        cout<<"\n";
    }


    cout<<"Multiplication of two Matrix :\n";
    for(int i=1;i<=row1;i++){
        for(int j=1;j<=col2;j++){
            cout<<result[i][j]<<" ";
        }
        cout<<"\n";
    }


    return 0;
}