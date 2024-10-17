#include <iostream>
using namespace std;

int queue[100], n = 100, front = -1, rear = -1;

void enqueue(int val)
{
    if (rear >= n - 1)
    {
        cout << "Queue Overflow" << endl;
    }
    else
    {
        if (front == -1)
        {
            front = 0; // Set front to 0 if the queue is initially empty
        }
        rear++;
        queue[rear] = val;
    }
}

void dequeue()
{
    if (front == -1 || front > rear)
    {
        cout << "Queue Underflow" << endl;
    }
    else
    {
        cout << "The dequeued element is " << queue[front] << endl;
        front++;
    }
}

void display()
{
    if (front == -1 || front > rear)
    {
        cout << "Queue is empty" << endl;
    }
    else
    {
        cout << "Queue elements are: ";
        for (int i = front; i <= rear; i++)
        {
            cout << queue[i] << " ";
        }
        cout << endl;
    } 
}

int main()
{
    int ch, val;
    cout << "1) Enqueue in queue" << endl;
    cout << "2) Dequeue from queue" << endl;
    cout << "3) Display queue" << endl;
    cout << "4) Exit" << endl;
    do
    {
        cout << "Enter choice: " << endl;
        cin >> ch;
        switch (ch)
        {
        case 1:
        {
            cout << "Enter value to be enqueued:" << endl;
            cin >> val;
            enqueue(val);
            break;
        }
        case 2:
        {
            dequeue();
            break;
        }
        case 3:
        {
            display();
            break;
        }
        case 4:
        {
            cout << "Exit" << endl;
            break;
        }
        default:
        {
            cout << "Invalid Choice" << endl;
        }
        }
    } while (ch != 4);
    return 0;
}
