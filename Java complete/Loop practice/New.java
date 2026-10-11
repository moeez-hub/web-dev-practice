public class New
{
    public static void main(String[] args)
  { 
        for(int i = 5; i >= 1; i--) {
            for(int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
                    for(int h = 1; h < i*2; h++) {
                        if(h>1 && h < (i*2)-1) {
                            System.out.print(" ");
                        }
                                else {
                                    System.out.print("*");
                                }
                    }
                                  System.out.println(" ");  
        
        
         }


       for(int i2 = 2; i2 <= 6; i2++) {
        for(int j2 = 5; j2 >= i2; j2--) {
            System.out.print(" ");
        } 
            for(int h2 = 1; h2 < i2*2; h2++) {
                 if(h2 > 1 && h2 < (i2*2)-1){
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