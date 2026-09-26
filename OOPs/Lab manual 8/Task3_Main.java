public class Task3_Main{
    public static void main(String[] args) {
        Task3_BookDescription b1 = new Task3_BookDescription();
        Task3_BookDescription b2 = new Task3_BookDescription("Jungle2", "iqbal", "Ähmad", 34);

        b1.setTitle("jungle");
        b1.setAuthor("Allama");
        b1.setPublisher("Kaka don");
        b1.setCopiesSold(32);

        b1.display();
        b2.display();

        System.out.println(b1.isMorePopular(b2) +"\n"+ b1.compare(b2) +"\n"+ b1.notEqual(b2));
        
        System.out.println(b1.toString() +"\n"+ b2.toString());

        b1.copy(b2);

        Task3_BookDescription b3 = b1.create(b2);
        b3.display();

    
    }
}