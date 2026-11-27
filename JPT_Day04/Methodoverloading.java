package JPT_Day04;

public class Methodoverloading {
    public static void main(String arg[]){
        OverloadMethod obj = new OverloadMethod();
        obj.addition (10,20);

    }
}
 class OverloadMethod{
    int addition(int a, int b){
        return a+b;
    }

    int addition(int a, int b, int c){
        return a+b+c;
    } 

    double addition(int a, int b, int c, int d){
        return a+b+c;
    }

    double addition(float a, float b, float c ){
        return a+b+c;
    }
 }