//Create a Calculator class with add(), subtract(), multiply() and divide() methods. Call each method from main(). Handle division by zero.
package JPT_Day04;

public class Exercise04 {
    public static void main(String arg[]){
        Calculator num =  new Calculator(5, 0);
        
        System.out.println("Add:"+num.add());
        System.out.println("Difference:"+num.diff());
        System.out.println("Multiplication:"+num.mul());
        System.out.println("Division:"+num.div());
    }
}

class Calculator{
    int num1;
    int num2;

    Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    double add(){
        return num1 + num2;
    }

    double diff(){
        return num1 - num2;
    }

    double mul(){
        return num1 * num2;
    }

    double div(){
        if (num2 == 0){
            System.out.println("Cannot divide by zero");
            return Double.NaN;
        }
        else {
           return (double) num1 / num2;
        }
    }
}
