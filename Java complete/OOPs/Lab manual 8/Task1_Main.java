public class Task1_Main {
    public static void main(String[] args) {
        Task1_Book b1 = new Task1_Book();
        Task1_Book b2 = new Task1_Book(213);
        Task1_Book b3 = new Task1_Book(45, 540.0);
        Task1_Book b4 = new Task1_Book(223, 65, 320.0);

        b1.setBookId(2432);
        b1.setPages(34);
        b1.setPrice(450.45);

        b2.setPages(67);
        b2.setPrice(657.5);

        b3.setBookId(57221);

        b1.display();
        b2.display();
        b3.display();
        b4.display();

        System.out.println(b1.isEqual(b2));

        System.out.println(b1.isLarger(b2) + "\n" + b1.isExpensive(b2));

        System.out.println(b1 + "\n" + b2+ "\n" + b3 + "\n" + b4);

        b1.copy(b2);

        Task1_Book b5 = b1.create(b2);

        System.out.println(b5.toString());
    }
}
