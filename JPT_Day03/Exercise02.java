//Gives marks from 0 to 100 ,print a grade using an else-if ladder.Define and document your grade range .
// Grade A: 90-100
// Grade B: 80-89
// Grade C: 70-79
// Grade D: 60-69
// Grade F: 0-59
package JPT_Day03;

public class Exercise02 {
    public static void main(String arg[]){
        int marks = 55;
        if(marks >= 90 && marks <= 100){
            System.out.println("Grade A");
        }
        else if(marks<90 && marks>=80){
            System.out.println("Grade B");
        }
        else if(marks<80 && marks>=70){
            System.out.println("Grade C");
        }
        else if(marks<70 && marks>=60){
            System.out.println("Grade D");
        }
        else {
            System.out.println("Grade F");
        }

    }
}
