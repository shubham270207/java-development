//Search for a target value in an array using a loop. Print whether it was found and its index if found.
package JPT_Day03;

public class Exercise08 {
    public static void main(String arg[]){
        int [] numbers = {10,20,25,35,48,56};
        int target = 48;
        boolean found = false;

        for(int i = 0; i < numbers.length; i++){
            if(target == numbers[i]){
                System.out.println("Target found at index: " + i);
                found = true;
                 break;
            }
        }

        if(!found){
            System.out.println("Target not found");
        }
    }
}
