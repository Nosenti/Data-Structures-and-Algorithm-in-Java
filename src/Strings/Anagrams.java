package Strings;

import java.util.Arrays;

// checks if two strings are anagrams
// anagram: a word, phrase, or name formed by rearranging the letters of another,
// such as spar, formed from rasp.
public class Anagrams {

    public static void isAnagrams(String a, String b){
        a = a.replace(" ","").toLowerCase();
        b = b.replace(" ", "").toLowerCase();

        char[] c = a.toCharArray();
        char[] d = b.toCharArray();

        Arrays.sort(c);
        Arrays.sort(d);

        if (Arrays.equals(c,d)){
            System.out.println( a + " and " + b + " are anagrams");
        }
        else {
            System.out.println(" Two words are not anagrams");
        }
    }

    public static void main(String[] args) {
        String a = "Go man";
        String b = "mango";

        isAnagrams(a,b);
    }
}
