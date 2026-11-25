//Store marks for five subjects. Caliculate total and average using sutiable data types.

public class Exercise05 {
    public static void main(String arg[]){
        int num1 = 10;
        int num2 = 44;
        int num3 = 53;
        int num4 = 85;
        int num5 = 56;

        int total = num1 + num2 + num3 + num4 + num5;
        System.out.println("Total=" + total);

        double avg = total / 5.0;
        System.out.println("Average=" + avg);
    }
}
