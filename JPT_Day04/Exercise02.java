//Create an Employee class with employeeId,name and salary. Add a displayDetails() method and create at least two employees objects.
package JPT_Day04;

public class Exercise02 {
    public static void main(String arg[]){
        Employee emp1 = new Employee(101, "Shubham", 50000);
        Employee emp2 = new Employee(102, "Rohit", 60000);

        emp1.displayDetails();
        System.out.println();
        emp2.displayDetails();
    }
    
}

class Employee{
    int employeeId;
    String name;
    int salary;

    Employee(int employeeId, String name, int salary){
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    void displayDetails(){
        System.out.println("EmployeeId:"+ employeeId);
        System.out.println("Name: "+ name);
        System.out.println("Salary: "+ salary);
    }

}