public class Task4_Main {
    public static void main(String[] args) {
        Task4_BookDescription b1 = new Task4_BookDescription();
        Task4_BookDescription b2 = new Task4_BookDescription();
        Task4_BookDescription b3 = new Task4_BookDescription();

        b1.setTitle("jungle");
        b1.setAuthor("Moeez");
        b1.setPublisher("Also Moeez");
        b1.setCopiesSold(54);

        b2.setTitle("computer");
        b2.setAuthor("jhony bhai");
        b2.setPublisher("Also Jhony bhai");
        b2.setCopiesSold(5);

        b3.setTitle("ChiryaKar");
        b3.setAuthor("Henry don");
        b3.setPublisher("Henry");
        b3.setCopiesSold(25);

        System.out
                .println(b1.getTitle() + "\n" + b1.getAuthor() + "\n" + b1.getPublisher() + "\n" + b1.getCopiesSold());
        System.out
                .println(b2.getTitle() + "\n" + b2.getAuthor() + "\n" + b2.getPublisher() + "\n" + b2.getCopiesSold());
        System.out
                .println(b3.getTitle() + "\n" + b3.getAuthor() + "\n" + b3.getPublisher() + "\n" + b3.getCopiesSold());
    }
}
