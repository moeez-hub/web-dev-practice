public class RunBook {
    public static void main(String[] args) {
        
        Book b1 = new Book();
        b1.setBookId(133);
        b1.setPages(34);
        b1.setPrice(100.0);

        Book b2 = new Book(1221);
        b2.setPages(45);
        b2.setPrice(200.0);

        Book b3 = new Book(1322,65);
        b3.setPrice(300);

        Book b4 = new Book(433, 67, 500.0);

        System.out.println(b1+"\n"+ b2 +"\n"+ b3+ "\n"+ b4);

        System.out.println(b1.isExpensive(b4));
        System.out.println(b1.isLarger(b4));
        System.out.println(b1.isEqual(b4));

        System.out.println("------b1 copyy into b4------");
        b1.copy(b4);
        System.out.println(b4);
    
        System.out.println("_____New objesct through method_____");
        Book b5 = b1.create(b2);
        System.out.println(b5);

    }
    
}
