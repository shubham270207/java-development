//Logical operators
//Create boolean Variable for hasregistration and haspaid fees display if student can attend exam using &&.

public class Exercise09{
    public static void main(String arg[]){
        boolean hasRegistration = true;
        boolean hasPaidFees = true;

        boolean canAttendExam = hasRegistration && hasPaidFees;
        System.out.println("Can the student attend the exam=" + canAttendExam);
        
    }
}