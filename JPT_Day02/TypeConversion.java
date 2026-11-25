public class TypeConversion{
    public static void main(String arg[]){
       /*  int age = 19;
        System.out.print(age);
 */
        //narrowing conversion
        double amount = 9999.75;
        int amount2 = (byte) amount;
        System.out.println(amount2);

        //wideening conversion
        int number = 10;
        double number2 = number;
        System.out.println(number2);
    }
    
}