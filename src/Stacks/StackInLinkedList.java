package Stacks;

// this program implement the stack on a linked list
// A linked list node
class Node{
    int data;  // integer data
    Node next;  // pointer to the next node

    public Node(){
        this.data = data;
        this.next = next;
    }

    public int getData(){
        return this.data;
    }
    public int getNext(){
        return this.data;
    }
}

public class StackInLinkedList {

    private Node top;
    private int size;

    public StackInLinkedList() {   // initializing a constructor

        this.top = null;
        this.size = 0;
    }

    // Utility function to add an element x in the stack
    public void push(int x) {  // insert at the beginning
        // Allocate the new node in the heap
        Node node = new Node();

        // check if stack(heap) is full. Then inserting an element
        // lead to stack overflow
        if (node == null) {
            System.out.println("\nHeap Overflow");
            return;
        }
        System.out.println("Inserting " + x);
        // set the data in allocated node
        node.data = x;
        // set the .next pointer of the new node to point to the current node
        // top node of the list
        node.next = top;
        //update the pointer
        top = node;
        size = size + 1;
    }

    // Utility function to check if the stack is empty or not
    public boolean isEmpty() {
        return top == null;
    }

    // utility function to return top element in a stack
    public int peek() {
        // check for empty stack
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    // Utility function to pop top element from the stack
    public void pop() {   // remove at the beginning
        // check for stack underflow
        if (top == null) {
            System.out.println("\nStack underflow");
            return;
        }

        System.out.println("removing " + peek());
        // update the top pointer to point to the next node
//        top = (top).next;
        Node temp = top;
        int item = temp.data;
        top = top.next;
        temp.next = null;
        size = size - 1;
    }

    public void getSize() {
        System.out.println("the size of the stack is " + size);
    }

    public void display() {
        Node current_top = top;
        while (current_top != null) {
            System.out.println(current_top .data);
            current_top  = current_top .next;
        }

    }

    public int search(int x) {
        int index = 0;
        Node current_top = top;
        while (current_top != null) {
            if (current_top.data == x) {
                return(index);
            }
            current_top = current_top.next;
            index = index + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        StackInLinkedList stack = new StackInLinkedList();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.display();
//        System.out.println(" Pos " + stack.search(1));;
//        System.out.println("The top element is "+ stack.peek());
//
//        stack.pop();
//        stack.pop();
//        stack.getSize();

        if(stack.isEmpty()){
            System.out.println("stack is empty");
        }else {
            System.out.println("stack is not empty");
        }
    }
}
