package JPT_Day04;

public class ThisKeyword {
    public static void main(String arg[]){
        Demo obj = new Demo(10, 20);
        obj.display();
    }
}

class Demo{
    int a=30;
    int b=40;

    Demo(int a , int b){
        this.a=a;
        this.b=b;
    }
    void display(){
        System.out.println("Values of c is:"+a+" and Values of d is: "+ b);
    }
}
