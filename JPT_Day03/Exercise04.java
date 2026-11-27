//use a loop to calculate the sum from 1 to n
package JPT_Day03;

public class Exercise04 {
    public static void main(String arg[]){
        int n = 10;
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("Sum from 1 to " + n + " is: " + sum);
    }
}
