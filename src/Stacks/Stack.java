package Stacks;
// implementing stacks using an array

public class Stack {

    int stack[] = new int[5];
    int top = 0;

    public void push(int x){

        stack[top] = x;
        top++;
        System.out.println(x + " is added to the stack");
    }
    public void peek(){
        int data;
        data = stack[top-1];
        System.out.println("The last element on the stack is " + data);
    }
    public void pop(){
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;

        System.out.println("Deleted: " + data);

    }
    public void display(){
        for (int n: stack){
            System.out.println(n + " ");
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

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
