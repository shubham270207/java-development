//Write a program to calculate simple interest using principle, rate and time.
package Home_Work_Problem_Day02;
public class Question01 {
    public static void main(String arg[]){
        double principle = 4000.0;
        double rate = 15.0;
        double time = 3.0;

        double SI = (principle * rate * time)/100;
        System.out.println("Simple Interest="+ SI);


    }
}
