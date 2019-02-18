package Stacks;


//This program uses one array to make two stacks: one for red cards and another one for black cards.


public class ColorCodedStack {
    int stack[] = new int[10];
    static int sizeBlack = 0;
    static int sizeRed = 0;
    int top_black = 0;
    int top_red = stack.length-1;

    public void pushRed(int x){
        stack[top_red] = x;
        top_red--;
        System.out.println(x + " is added to the red stack");
        sizeRed = sizeRed + 1;

    }
    public void pushBlack(int x){
        stack[top_black] = x;
        top_black++;
        System.out.println(x + " is added to the black stack");
        sizeBlack = sizeBlack + 1;
    }
    public void popBlack(){
        int data;
        top_black--;
        data = stack[top_black];
        stack[top_black] = 0;
        System.out.println(data + " is removed from the black stack");
        sizeBlack = sizeBlack - 1;
    }
    public void popRed(){
        int data;
        top_red++;
        data = stack[top_red];
        stack[top_red] = 0;
        System.out.println(data + " is removed from the red stack");
        sizeRed = sizeRed - 1;
    }
    public void display(){
        for (int n:stack){
            System.out.println(n);
        }
    }

    public int peekBlack(){
        int data;
        data = stack[top_black - 1];
        System.out.println("last element of the black pack is " + data);
        return data;
    }
    public int peekRed(){
        int data;
        data = stack[top_red - 1];
        System.out.println("last element of the black pack is " + data);
        return data;
    }
//    public boolean isBlackEmpty(){
//
//    }
//    public boolean isRedEmpty(){
//
//    }
    public  static int getSizeBlack(){
        return sizeBlack;
    }
    public static int getSizeRed(){
        return sizeRed;
    }

    public static void main(String[] args) {
        ColorCodedStack stack = new ColorCodedStack();
        stack.pushBlack(4);
        stack.pushRed(5);
        stack.pushRed(6);
        stack.pushBlack(7);
//        stack.popBlack();
//        stack.popRed();
        System.out.println(" size of black stack: " + getSizeBlack());
        System.out.println("size of Red stack: "+ getSizeRed());
        stack.display();
    }
}
