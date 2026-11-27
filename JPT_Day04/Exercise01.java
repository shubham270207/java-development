//Create a Student class with name,rollNumber and Branch field. Create two objects, assign valuues and display each student's details.
package JPT_Day04;

public class Exercise01 {
    public static void main(String arg[]){
        Student obj1 = new Student("Shubham", 19, "IT");
        Student obj2 = new Student("Rohit", 20, "Computer");
        obj1.display();
        System.out.println();
        obj2.display();
    }
}

class Student{
    String name ;
    int rollNumber;
    String branch;

    Student(String name, int rollNumber, String branch){
        this.name = name;
        this.rollNumber = rollNumber;
        this.branch = branch;
    }

    void display(){
        System.out.println("Name: "+ name);
        System.out.println("RollNumber: "+ rollNumber);
        System.out.println("Branch: "+ branch);
    }
}

