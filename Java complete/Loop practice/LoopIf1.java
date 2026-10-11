public class LoopIf1
{
    public static void main(String[] args)
  {
      // for(int i = 0; i <= 20; i++) {
      //   if(i % 5 == 0) {
      //       System.out.println("Multiple of 5");
      //   }
      //     else {
      //       System.out.println(i);
      //     }  
      
      // }

         int i = 0;
        while(i <= 20) {
          i++;
        
          if(i % 5 == 0) {
            System.out.println("Multiple of 5");
          }
         else{
          System.out.println(i);
         }   
        }


  }  
}