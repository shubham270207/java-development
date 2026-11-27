package JPT_Day04;

public class Addition {
    public static void main(String arg[]){
        int sum = 0;
        Arithmetic obj = new Arithmetic(40 , 50);
        sum = obj.addition(10,20);
        System.out.println("Addition of Two numbers is:" + sum);
    }

    /* static int addition(int a, int b){
        return a+b;
    } */
}

class Arithmetic{
    Arithmetic(){
        System.out.println("Inside default constructor");
    }
    Arithmetic(int x, int y){
        System.out.println("Inside paramertrice constructor");
    }
    int addition(int a, int b){
        return a+b;
    }
}
