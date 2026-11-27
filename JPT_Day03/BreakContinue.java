package JPT_Day03;

public class BreakContinue {
    public static void main(String arg[]){
        for(int i=1; i<=10; i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }
        System.out.println("  ");
        for(int y=1; y<=10; y++){
            if(y==5){
                continue;
            }
            System.out.println(y);
        }
    }
}