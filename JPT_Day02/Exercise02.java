//Declear two integer variable and display their sum, diff, product, quotient and remainder

public class Exercise02 {
    public static void main(String arg[]){
        int num1 = 20;
        int num2 = 45;

        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 *num2;
        double quotient = num1 / num2;
        double remainder = num1 % num2;

        System.out.println("Sum="+sum);
        System.out.println("Difference=" + diff);
        System.out.println("Product="+ product);
        System.out.println("Quotient="+ quotient);
        System.out.println("Remainder="+ remainder);
    }
    
}
