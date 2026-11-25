//Swap two integer values using a temporary variable 

public class Exercise06 {
    public static void main(String arg[]){
        int first = 10;
        int second = 20;
        int temp = first;
        first = second;
        second = temp;

        System.out.println("first=" + first + "\n" + "second=" + second);

    }
}
