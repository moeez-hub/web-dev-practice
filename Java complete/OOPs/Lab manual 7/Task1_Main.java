public class Task1_Main {
    public static void main(String[] args) {
        
        
        Task1_Book b1 = new Task1_Book();
        Task1_Book b2 = new Task1_Book(232);
        Task1_Book b3 = new Task1_Book(23, 300.3);
        Task1_Book b4 = new Task1_Book(322, 32, 34.23);
    
    

        b1.setBookId(312);
        b1.setPages(213);
        b1.setPrice(233.21);

        b2.setPages(50);
        b2.setPrice(300.30);
        
        b3.setBookId(2312);

        b1.display();
        b2.display();
        b3.display();
        b4.display();

        System.out.println(b1 +"\n"+ b2 +"\n"+ b3 +"\n"+ b4);
        System.out.println(b1.isLarger(b2) +"\n"+ b1.isExpensive(b2));

        b1.copy(b2);

        System.out.println("b2 After copy b1"+b2);


    }
    
}
