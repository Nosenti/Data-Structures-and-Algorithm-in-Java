package Recursion;

// This program produces nth Fibonnaci series by using recursive method
public class Fibonnaci {

    public int  fibonnaci(int n){
        if(n <= 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else {
            return fibonnaci(n-1) + fibonnaci(n-2);
        }
    }
    public static void main(String[] args) {
        Fibonnaci fibo = new Fibonnaci();
        System.out.println(fibo.fibonnaci(7));
    }
}
