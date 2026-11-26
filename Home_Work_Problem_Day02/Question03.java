//Write a program to calculate the percentage of six subjects.
package Home_Work_Problem_Day02;

public class Question03 {
    public static void main(String arg[]){
        double subject1 = 80.0;
        double subject2 = 90.0;
        double subject3 = 70.0;
        double subject4 = 85.0;
        double subject5 = 75.0;
        double subject6 = 95.0;

        double totalMarks = subject1 + subject2 + subject3 + subject4 + subject5 + subject6;
        double percentage = (totalMarks / 600) * 100;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

    }
    
}
