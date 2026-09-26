public class NewPatterns
{
    public static void main(String[] args) {

//  {  
//      for(int i = 5; i >= 1; i--) {
//         for(int j = i; j <= 5; j++) {
//             System.out.print(" ");
//         }
//                 for(int h = 1; h < (i*2); h++) {
//                     if(h > 1 && h < (i*2)-1) {
//                         System.out.print(" ");
//                     }
//                        else {
//                         System.out.print("*");
//                        } 
                
//                 }
//                    System.out.println(" "); 
//     }

            for(int l = 2; l <= 6; l++) {
                for(int m = 5; m >= l; m--) {
                    System.out.print(" ");
                }
                   for(int u = 1; u < l*2; u++) {
                        if(u > 1 && u < (l*2)-1){
                            System.out.print(" ");
                        } 
                            else {
                                System.out.print("*");
                            }
                   }
                   System.out.println(" ");

            
            
            
                }        

















    }
}