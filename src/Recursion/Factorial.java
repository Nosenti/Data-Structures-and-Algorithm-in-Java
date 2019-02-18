package Recursion;

// this program computes any factorial by using a recursive method

public class Factorial {

    public static int factorial(int x){
        if (x <= 0){
            return 1;
        }else {
            return x*factorial(x-1);
        }
    }


    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.println(fact.factorial(4));
    }
}
