// package LinkedList;
// package Linkedlist;

// No imports needed - classes are defined in this file
class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}

class Linkedlist {

    Node head;
    int count = 0, evencount = 0;

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

        temp.next = newNode;

    }

    // Count the elements in the Linkedlist
    void count() {
        Node tem1 = head;

        while (tem1 != null) {
            count++;
            int num = tem1.data;

            if (num % 2 == 0) {
                evencount++;
            }
            tem1 = tem1.next;
        }
    }

    // Display all the linked list
    void displayele(Node temp) {

        while (temp != null) {
            if (temp.next == null) {
                System.out.print(temp.data);
            } else {
                System.out.print(temp.data + " -> ");
            }
            temp = temp.next;
        }
    }

    // Print the Middle element in the List
    void middle() {
        Node temp = head;

        displayele(temp);
        count();

        int mid = count / 2;
        if (count % 2 != 0) {
            mid = mid + 1;
        }

        // mid-1 => everytime looping the node point to the next element.so i stop the loop before 1 step.
        for (int i = 0; i < mid - 1; i++) {
            temp = temp.next;
        }
        System.out.println("\nMid Element : " + temp.data);
        System.out.println("Event Numbers in the LinkedList : " + evencount);
    }

    //Delete begin Elements...
    void deletebegin() {
        Node tem = head.next;
        displayele(tem);

    }

}

public class LinkedListMid {

    public static void main(String[] args) {
        Linkedlist ls = new Linkedlist();
        ls.insert(1);
        ls.insert(2);
        ls.insert(3);
        ls.insert(4);
        ls.insert(5);
        ls.insert(6);

        ls.middle();
        ls.deletebegin();
    }

}
