package Queues;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListQueue {
    static ArrayList<Integer> transaction = new ArrayList<Integer>();
    int front = 0;
    int rear = 0;
    static int size = 0;

    public void push(int x){
        transaction.add(x);
        rear++;
        size += 1;
    }

    // https://en.wikipedia.org/wiki/Peek_(data_type_operation)
    public int peek(){
        int data;
        data = transaction.get(front);
        return data;
    }

    public void display(){
        for( int n: transaction){
            System.out.println(n +" ");
        }
    }

    public int pop(){
        size = size - 1;
        return transaction.remove(0);

    }
    public static int getSize(){
        return size;
    }


    public static void main(String[] args) {
        int input;
        int initialShares = 0;
        int balance = 0;

        ArrayListQueue queue = new ArrayListQueue();

        Scanner reader = new Scanner(System.in);

        while (true){
            System.out.println("Press 1 if you want to buy shares and 2 if you want to sell shares: ");
            input = reader.nextInt();
            int numShares;
            int sellingPrice = 0;
            if (input == 1){
                System.out.println("How many shares do you want to buy? : ");
                numShares = reader.nextInt();
                System.out.println("what is the price of one share? : ");
                sellingPrice = reader.nextInt();
                while (numShares > initialShares){
                    queue.push(sellingPrice);
                    numShares -= 1;
                }

            }else if (input == 2){
                System.out.println("How many shares do you want to sell? : ");
                int sharesBought = reader.nextInt();
                System.out.println("What is the price of one share? ");
                int buyingPrice = reader.nextInt();

                while (sharesBought > 0){
                    balance = balance + (buyingPrice -  queue.peek());

                    queue.pop();
                    sharesBought--;
                }

            }
            System.out.println("Profit: " + balance);
        }

    }

}
