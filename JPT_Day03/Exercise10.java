//Count vowels and consonants in a String. Ignore spaces and non-letter characters.
package JPT_Day03;

public class Exercise10 {
    public static void main(String arg[]){
        String msg = "Java is easy to learn.";
        int vowels = 0;
        int consonants = 0;
        String chars = msg.toLowerCase();

        for(int i=0; i<msg.length();i++){
            if(chars.charAt(i)>='a' && chars.charAt(i)<='z'){
                if(chars.charAt(i)=='a' || chars.charAt(i)=='e' || chars.charAt(i)=='i' || chars.charAt(i)=='o' || chars.charAt(i)=='u'){
                    vowels++;
                }
                else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels=" + vowels +"\n"+ "Consonants=" + consonants);

    }
}
