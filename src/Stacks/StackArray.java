package Stacks;
// implementing stacks using an array

public class StackArray {

    int stack[] = new int[5];
    int top = 0;
    int size = 0;

    public void push(int x){

        stack[top] = x;
        top++;
        System.out.println(x + " is added to the stack");
        size = size + 1;
    }
    public void peek(){
        int data;
        data = stack[top-1];
        System.out.println("The last element on the stack is " + data);
    }
    public int pop(){
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;

        System.out.println("Deleted: " + data);
        size = size - 1;
        return data;

    }
    public void display(){
        for (int n: stack){
            System.out.println(n + " ");
        }
    }
    public boolean isEmpty(){
        return size == 0;
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray();

        stack.push(2);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.pop();
        stack.pop();
        stack.peek();
        stack.display();

    }
}
