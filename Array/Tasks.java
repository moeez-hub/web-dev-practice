public class Tasks
{
     public static void main(String[] args) {
        int[] num =  {2, 5, 4, 6, 56, 34, 32, 2, 4, 5, 2, 2};
    //    int max = num[0];
    //    int max2 = num[0];
    //   for(int i = 0; i < num.length; i++) {
    //     if(num[i] > max) {
    //          max2 = max;
    //          max = num[i];   
    //     }
    //         else if(num[i] > max2 && num[i] != max) {
    //             max2 = num[i];
    //         }
    //   }
    //         System.out.println(max2);

     
        //    Find duplicate 
    //  for(int i =0; i < num.length; i++) {
    //     for(int j = i+1; j < num.length; j++) {
    //         if(num[i]==num[j]) {
    //             System.out.println(num[i]);
    //         }
    //     }
    //  } 


        // Most repeated value
       int mostrep = num[0];
        int maxcount = 0;
        for(int i = 0; i < num.length; i++) {
             int count = 0;
            for(int j = i+1; j < num.length; j++) {
                if(num[i] == num[j]) {
                    count++;
                }
                    if(count > maxcount) {
                        maxcount = count;
                        mostrep = num[i]; 
                    }
            
            
            }
        }    
           System.out.println(mostrep);     
     
     
     
     
     }
}      