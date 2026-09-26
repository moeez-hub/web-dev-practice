import java.util.*;
public class Repeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];

        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] %2 == 0){
                System.out.println(arr[i] +"  even");
            }
        
            else if (arr[i]%2 != 0) {
                System.out.println(arr[i]+"  odd");
            }
     
            // else{
            //     System.out.println("0");
            // }
        }
    }
}
