//Reverse a String using a loop and character access. Do not use StringBuilder.reverse() for this exercise.
package JPT_Day03;

public class Exercise11 {
    public static void main(String arg[]){
        String sent = "In this program we will learn about the string";
        for(int i=sent.length()-1; i>=0; i--){
           System.out.print(sent.charAt(i));
        }
    }
}
