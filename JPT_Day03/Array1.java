package JPT_Day03;

public class Array1 {
    public static void main(String arg[]){
        int [] numbers ={15,19,29,10,28};
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        int avg = 0;

        for(int i=0 ; i<numbers.length; i++){
            sum = sum + numbers[i];

            avg = sum/numbers.length;

            if(numbers[i]<min){
                min = numbers[i];
            }
            else if (numbers[i]>max){
                max = numbers[i];
            }
           
        }
        System.out.println("Sum value: " + sum);
        System.out.println("Average value: " + avg);
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

    }
}
