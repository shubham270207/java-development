//Given a String, print its length, uppercase version, lowercase version and whether it contains the word "Java".
package JPT_Day03;

public class Exercise09 {
    public static void main(String arg[]){
        String word = "developer";

        System.out.println(word.length());
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());
        System.out.println(word.contains("Java"));
    }
    
}
