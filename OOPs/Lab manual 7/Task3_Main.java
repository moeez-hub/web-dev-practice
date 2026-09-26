public class Task3_Main {
    public static void main(String[] args) {

        Task3_BookDescription b1 = new Task3_BookDescription();
        Task3_BookDescription b2 = new Task3_BookDescription("Jungle", "Ali", "ABC", 10);
        Task3_BookDescription b3 = new Task3_BookDescription("Chirya kar", "Ahmed", "ABC2", 80);

        b1.setTitle("Moon");
        b1.setAuthor("Moeez.");
        b1.setPublisher("AbC3");
        b1.setCopiesSold(54);

        // b2.setCopiesSold(76);

        b1.display();
        b2.display();
        b3.display();

        System.out.println(b1);
        System.out.println(b2);

        System.out.println(b1.isMorePopular(b2));

        System.out.println(b1.compare(b2));

        b1.copy(b2);
       
    }
}
