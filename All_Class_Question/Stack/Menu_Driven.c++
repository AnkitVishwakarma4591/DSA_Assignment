# include <iostream>
# include <stack>
using namespace std;

int main(){
    stack<int> s;
    int choice;
    do{
        cout<<"Menu Driven"<<endl;
        cout<<"1. Push"<<endl;
        cout<<"2. Pop"<<endl;
        cout<<"3. Display"<<endl;
        cout<<"4. Exit"<<endl;
        cout<<"Enter your Choice :";
        cin>>choice;
        switch(choice){
            case 1 : int element;
                     cout<<"Enter element for push :";
                     cin>>element;
                     s.push(element);
                     cout<<"Elements "<< element<< " push to the Stack "<<endl;
                     break;
            case 2 : if(s.empty()){
                        cout<<"Stack is UnderFlow can't Popped an element"<<endl;
                    }else{
                        int popped = s.top();
                        s.pop();
                        cout<<"Popped Element is : "<< popped <<endl;
                    }
                    break;
            case 3 : if(s.empty()){
                        cout<<"Stack is empty"<<endl;
                    }else{
                    stack<int> tempStack = s;
                    cout << "Current Stack: ";
                    while (!tempStack.empty()) {
                        cout << tempStack.top() << " ";
                        tempStack.pop();
                    }
                    cout << endl;
                    }
                    break;
            case 4 : cout<<"Exiting program..."<<endl;
                        break;
            default : cout<<"Invalid choice! Please try again"<<endl;
                        break;
        }
    }while(choice != 4);
    
    return 0;
}