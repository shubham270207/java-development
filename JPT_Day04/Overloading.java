//Rectangle with overloaded constructors
package JPT_Day04;

class Rectangle {
    
    double length;
    double breadth;

    
    Rectangle() {
        this(1.0,1.0);
    }

    
    Rectangle(double side) {
        this(side , side);
    }

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    

    double calculateArea() {
        return length * breadth;
    }
}

public class Overloading {
    public static void main(String arg[]){
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4, 6);

        System.out.println(r1.calculateArea());
        System.out.println(r2.calculateArea());
        System.out.println(r3.calculateArea());
    }
}