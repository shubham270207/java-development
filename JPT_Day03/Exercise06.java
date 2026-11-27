//Store at least five integers in an array and calculate the sum and average.
package JPT_Day03;

public class Exercise06 {
    public static void main(String arg[]){
        int [] numbers ={15,19,29,10,28};
        int sum = 0;
        double avg = 0;
        for(int i=0 ; i<numbers.length; i++){
            sum = sum + numbers[i];
        }
        avg = (double) sum/numbers.length;

    System.out.println("Sum ="+ sum);
    System.out.println("Average ="+ avg);
    }

}
