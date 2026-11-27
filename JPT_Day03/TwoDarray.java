package JPT_Day03;

public class TwoDarray {
    public static void main(String arg[]){
        int [][]arr ={{10,20,30,40,50},{60,70,80,90,100}};
        /* System.out.println(arr[0][0]);
        System.out.println(arr[1][0]);
        System.out.println(arr[0][2]); */

        for(int i=0 ; i<arr.length; i++){
            for(int j=0 ; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
