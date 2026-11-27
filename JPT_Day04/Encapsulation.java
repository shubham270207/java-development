
package JPT_Day04;

class Person {
    private int age;

    // Setter method
    public void setAge(int age) {
        this.age = age;
    }

    // Getter method
    public int getAge() {
        return age;
    }

    public void checkEligibility() {
        if (age >= 18) {
            System.out.println("Person is eligible for voting");
        } else {
            System.out.println("Person is not eligible for voting");
        }
    }
}

public class Encapsulation {
    public static void main(String arg[]) {

        Person p = new Person();

        p.setAge(20);

        System.out.println("Age: " + p.getAge());

        p.checkEligibility();
    }
}
