#include <iostream>
using namespace std;

class node{
    public:
    int data;
    node* next;
    node* previous;
    
    node(int val)
    {
        data=val;
        next=NULL;
        previous=NULL;
    }
 
};

void insert_at_head(node* &head,int val)
{
    node* n= new node(val);
    n->next=head;
    if(head!=NULL)
    {
    head->previous=n;
    }
    head=n;
}

void insert_at_tail(node* &head,int val)
{
    node* n=new node(val);
    if(head==NULL)
    {
        //head=n;
        insert_at_head(head,val);
        return;
    }
    node* temp=head;
    while(temp->next!=NULL)
    {
        temp=temp->next;
    }
    temp->next=n;
    n->previous=temp;
}

void insert_at_pos(node* &head,int val,int pos)
{
    node* n=new node(val);
    node* temp=head;
    node* po=temp->next;
    
    if(head==NULL || pos==1)
    {
        insert_at_head(head,val);
        return;
    }
   
    int count=2;
    while(count!=pos)
    {
       temp=temp->next;
        if(temp->next==NULL)
    {
        insert_at_tail(head,val);
        return;
    }
       po=po->next;
      count++;
    }
   
    temp->next=n;
    n->previous=temp;
    n->next=po;
    po->previous=n;
    
}

void display(node* head)
{
    node* temp=head;
    while(temp!=NULL)
    {
        cout<<""<<temp->data<<"-> ";
        temp=temp->next;
    }
    cout<<"NULL"<<endl;
}

int main()
{
    node* head=NULL;
    insert_at_tail(head,1);
    insert_at_tail(head,2);
    insert_at_tail(head,3);
    insert_at_tail(head,4);
    insert_at_tail(head,6);
    insert_at_tail(head,7);
    insert_at_pos(head,5,8);
    insert_at_pos(head,8,7);
    display(head);
}