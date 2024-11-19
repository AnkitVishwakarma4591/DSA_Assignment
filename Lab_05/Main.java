// // Create and manipulate singly linked lists in Java.

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {
    private Node head;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void deleteNode(int value) {
        if (head == null) {
            System.out.println("List is empty. No node to delete.");
            return;
        }
        if (head.data == value) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Node with value " + value + " not found.");
        } else {
            temp.next = temp.next.next;
        }
    }

    public void displayList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main list = new Main();

        System.out.println("Enter the number of nodes to add:");
        int numberOfNodes = scanner.nextInt();

        System.out.println("Enter " + numberOfNodes + " node values:");
        for (int i = 0; i < numberOfNodes; i++) {
            int value = scanner.nextInt();
            list.addNode(value);
        }

        System.out.println("Original List:");
        list.displayList();

        System.out.println("Enter the value of the node to delete:");
        int valueToDelete = scanner.nextInt();

        list.deleteNode(valueToDelete);

        System.out.println("List after deletion:");
        list.displayList();

        scanner.close();
    }
}
