//Find and print the smallest and largest elements in an integer array.
package JPT_Day03;

public class Exercise07 {
    public static void main(String arg[]){
        int [] numbers ={15,19,29,10,28};
        int min = numbers[0];
        int max = numbers[0];

        for(int i=0 ; i<numbers.length; i++){
            if(numbers[i]<min){
                min = numbers[i];
            }
            else if (numbers[i]>max){
                max = numbers[i];
            }
           
        }
        
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

    }
    
}
