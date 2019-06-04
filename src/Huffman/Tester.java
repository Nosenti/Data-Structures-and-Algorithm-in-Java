package Huffman;

public class Tester {

    public static void main(String[] args) {
        Huffman myHuff  =  new Huffman();
        String message = "";
        // try reading
        try{
            message = myHuff.readFile("./src/huffman/nosenti.txt");
        } catch (Exception e){
            System.out.println("No file");
        }
        // try writing
        try{
            myHuff.writeToFile("./src/huffman/nosenti_output.txt", message);
        }catch (Exception e){
            System.out.println("Failed output");
        }
//        System.out.println(myHuff.frequencyTable("Innocent"));

        myHuff.printCode(myHuff.stringToTree("innocent"), " ");
//        myHuff.encodeMessage(myHuff.encodeMessage("nosenti.txt"), "innocent");
    }
}
