//claculate the factorial of a non negative integer using loop treat 0! as 1.
package JPT_Day03;

public class Exercise05 {
    public static void main(String arg[]){
    
        int n = 5;
        if(n < 0){
            System.out.println("Factorial is not defined for negative numbers");
        }
        else{
         int fact = 1;

         for(int i = 1; i <= n; i++){
           fact *= i;
        }

    System.out.println("Factorial = " + fact);
     } 
    
    }
}
