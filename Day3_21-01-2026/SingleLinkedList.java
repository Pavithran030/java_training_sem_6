
import java.util.*;

class Node {

    int data;
    Node next;

    public Node(int da) {
        this.data = da;
    }
}

class Linkedlist {

    Node head;

    void insert(int a) {

        Node newNode = new Node(a);
        newNode.next = null;
        /*

        Way --1

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

         */
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        // temp = temp.next;

    }

    void display() {
        Node temp = head;

        while (temp != null) {
            if (temp.next == null) {
                System.out.print(temp.data);
            } else {
                System.out.print(temp.data + " -> ");
            }
            temp = temp.next;
        }
    }
}

public class SingleLinkedList {

    public static void main(String[] args) {

        try (Scanner inp = new Scanner(System.in)) {
            // System.out.println("Enter the Total ");

            Linkedlist ls = new Linkedlist();
            ls.insert(10);
            ls.insert(20);
            ls.insert(30);

            ls.display();
        }

    }
}
