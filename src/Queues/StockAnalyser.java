package Queues;

class Transaction{
    Transaction next;
    double data;
    public Transaction(){
        double data;

    }
}
public class StockAnalyser {
    private Transaction first;
    private Transaction last;
    private int size;

    public StockAnalyser(){
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public void buy(double price, int num){
        Transaction transaction = new Transaction();
        if(first ==  null){
            first = transaction;
            last = transaction;
        }else {
            last.next = transaction;
            last = transaction;
        }
        last.data = price;
        System.out.println("bought " + num +"shares for "+price+" each");
        size = size + 1;

    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return getSize() == 0;
    }
    public void sell( double price, int num){
        if(first == null){
            System.out.println("stack underflow");
            return;
        }
        Transaction temp = first;
        System.out.println("selling " + temp.data);
    }
    public static void main(String[] args) {
        StockAnalyser transaction  = new StockAnalyser();
        transaction.buy(45,20);
        System.out.println(transaction.isEmpty());
        System.out.println(transaction.getSize());
    }
}
