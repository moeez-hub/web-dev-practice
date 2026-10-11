public class ArrayTask
{
      public static void main(String[] args)
  {
       
    //    Find max number
         int[] numbers = {7, 45, 3, 6, 76, 44};
            int max = numbers[0];
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        } 
                System.out.println(max);
  

      //  int[] num = {4, 56, 7, 6, 6, 5};
      //  int counter = 0;
      //  int counter2 = 0; 
      //     for(int i = 0; i < num.length; i++) {
      //       if (num[i] % 2 == 0) {
      //          counter++; 
      //       }
      //          else {
      //           counter2++;
      //          } 
          
      //     }  
      //               System.out.println(counter);
      //               System.out.println(counter2);             

  }    
} 