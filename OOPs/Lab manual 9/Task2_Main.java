public class Task2_Main {
    public static void main(String[] args) {
        Task2_Course c1 = new Task2_Course();
        Task2_Course c2 = new Task2_Course("3214", "Bs english", 89);
        Task2_Course c3 = new Task2_Course("42132", "Bs CS", 70);
        Task2_Course c4 = new Task2_Course("3241", "Medical", 40);
        Task2_Course c5 = new Task2_Course(c2); 
        
        c1.setCode("2132");
        c1.setName("FSC");
        c1.setCredits(50);

        Task2_Course[] c =  new Task2_Course[5];
        c[0] = c1;
        c[1] = c2;
        c[2] = c3;
        c[3] = c4;
        c[4] = c5;

        Task2_Course.print(c);
    
        System.out.println(c[4].isEqual(c[1]));

        System.out.println(Task2_Course.linearSearch(c, "3241"));
    
        Task2_Course.sort(c);
        System.out.println("After Sorting");
        Task2_Course.print(c);


         int index = Task2_Course.search(c, "Bs CS");
        if (index != -1){
            System.out.println("Found at index: " + index);
        }
            else{
            System.out.println("Not Found");
        }
    }
}
