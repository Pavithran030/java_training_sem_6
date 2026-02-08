package Stack1;

class StackNode {

    int data;
    StackNode next;

    StackNode(int data) {
        this.data = data;
    }

}

class StackCreation {

    StackNode top;
    int count = 0;

    // Creation
    void push(int data) {
        StackNode node = new StackNode(data);
        node.next = top;
        top = node;

    }

    // Remove the top element from the Stack
    void pop() {
        StackNode temp = top;
        if (top == null) {
            System.out.println("Stack Undeflow..!!!");
            return;
        }

        top = top.next;
        System.out.print("Remaining Stack : ");
        display(temp);
    }

    // Reverse the Stack to display 
    void revserstack() {

        StackNode curr = top, pre = null, nex;

        while (curr != null) {
            nex = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nex;
        }
        top = pre;

        display(top);
    }

    // Display the Stack elements
    void display(StackNode top) {
        StackNode temp = top;
        while (temp != null) {
            count++;
            if (temp.next == null) {
                System.out.print(temp.data);
            } else {
                System.out.print(temp.data + " -> ");
            }
            temp = temp.next;
        }
    }
}

public class Stack {

    public static void main(String[] args) {
        StackCreation st = new StackCreation();

        st.push(2);
        st.push(4);
        st.push(6);

        System.out.println("Total Element in the Stack : " + st.count);

        System.out.print("Current Stack Elements : ");
        st.display(st.top);

        System.out.println("Poped Element from the stack : " + st.top.data);
        st.pop();

        System.out.print("\nReversed Stack : ");
        st.revserstack();

    }

}
