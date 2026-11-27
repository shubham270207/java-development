//Create a Rectangle class with length and breadth. Add methods to calculate area and perimeter. Test with two objects.
package JPT_Day04;

public class Exercise03 {
    public static void main(String arg[]){
        Rectangle r1 = new Rectangle(4, 5);
        r1.area();
        r1.perimeter();
        System.out.println("Area:" + r1.area());
        System.out.println("Perimeter: "+ r1.perimeter());

    }
    
}

class Rectangle{
    double length;
    double breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    double area(){
        return length * breadth;
    }

    double perimeter(){
        return 2*(length + breadth);
    }
}
