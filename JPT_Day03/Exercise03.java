//Create a menuwith option 1-4 for addition, substraction, multiplication, and division. use switch to perform the selected operation.
package JPT_Day03;

public class Exercise03 {
    public static void main(String arg[]){
        int num1 = 5;
        int num2 = 4;

        int choice = 3;
        switch(choice){
            case 1:
                System.out.println("sum ="+ (num1+num2));
                break;
            case 2: 
                System.out.println("substraction ="+ (num1-num2));
                break;
            case 3:
                System.out.println("multiplication ="+ (num1*num2));
                break;
            case 4:
                System.out.println("division ="+ (num1/num2));
                break;
            default:
                System.out.println("Invalid choice");
                break;

        }
    }
}
