import java.util.Scanner;
public class Method
// {
//      public static int calculateSum(int a, int b, int c) {
//         int sum = a + b + c;
//         return sum;
//      }
//         public static void main(String[] args) {
//             int a = 2;
//             int b = 3;
//             int c = 4;
//           System.out.println(calculateSum(a, b, c));  

//        }





    //    Table Printer
  
// {
//     static void printTable(int number) {
//         for(int i = 0; i <= 10; i++) {
//              System.out.println(number*i);
//         }
//     }
//       public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); 
//       System.out.println("Enter a num?"); 
//        int num = sc.nextInt();
//         printTable(num);
//       }  
// }  



        // Even odd  Function
//      {
//         static void EvenOddchecker(int num) {
//             if(num % 2 == 0) {
//                 System.out.println("Even");
//             }
//               else {
//                 System.out.println("Odd");
//               }  
                   
//         }
//           public static void main(String[] args) { 
//             Scanner sc = new Scanner(System.in);
//           System.out.println("Enter num?"); 
//            int a = sc.nextInt(); 
//           EvenOddchecker(a);  
          
//        }   
//    }  


            // Find sum of Array
        // {
        //     static int ArraySum(int[] arr) {
        //     int sum = 0;
        //     for(int i = 0; i < arr.length; i++) {
        //         sum = sum + arr[i];
        //     }
        //         return sum;
        // }         
       

        //     public static void main(String[] args) {
        //         Scanner sc = new Scanner(System.in);
        //        System.out.println("Enter size");
        //         int size = sc.nextInt();
        //        int[] array = new int[size];
        //       for(int i = 0; i < size; i++){ 
        //         array[i] = sc.nextInt();   
        //       }              
        //       int total = ArraySum(array);
        //        System.out.println("Sum = " +total); 
        //     }
        // } 




        //    multyply arrays
 {
    public static int Multyplyarr(int[] arr) {
        int mult = 1;
       for(int i = 0; i < arr.length; i++) {
       mult = mult * arr[i];  
     } 
        return mult;
  }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter size");
        int size = sc.nextInt();
       int[] num = new int[size];
       for(int i = 0; i < size; i++) {
          num[i] = sc.nextInt();   
       }  
          int multy = Multyplyarr(num);
             System.out.println("Answer is : "+ multy);   
    }  







}