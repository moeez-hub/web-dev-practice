public class Task12 {
    static int[] negativeBeforePositive(int[] array) {
        int[] temp = new int[array.length];
        int index = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] < 0){
                temp[index] = array[i];
                index++;
            }
        }    
         for(int i = 0; i < array.length; i++){   
             if(array[i] >= 0) {
                temp[index] = array[i];
                index++;
            }
        } 
        
            return temp;
    }

    static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = { 23, 34, 67, -1, -67, -45, 12, 34, -56 };
        int[] arr = negativeBeforePositive(array);
                    printArray(arr);
    }
}
