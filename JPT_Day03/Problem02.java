package JPT_Day03;

public class Problem02 {
    public static void main(String arg[]){
        String str = "In this program we will learn about the string";
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }
        }
        System.out.println(count);


    }
}
