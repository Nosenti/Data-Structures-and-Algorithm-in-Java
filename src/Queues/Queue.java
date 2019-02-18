package Queues;
// implementing a queue using an array
public class Queue {

    int queue[] = new int[6];
    int front = 0;
    int rear = 0;

    public void push(int x){
        //queue[front] = x;
        queue[rear] = x;
        rear++;
        System.out.println(x + " is added to the queue");
    }
    public void peek(){
        int data;
        data = queue[rear-1];
        System.out.println("The last element is "+ data);
    }

    public void display(){
        for( int n: queue){
            System.out.println(n +" ");
        }
    }
    public void pop(){
        int data;
        data = queue[front];
        queue[front] = 0;
        front++;
        rear--;
        System.out.println(data + " is deleted");
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.push(5);
        queue.push(6);
        queue.push(7);
        queue.pop();
        queue.pop();
//        queue.peek();
        queue.display();
    }
}

