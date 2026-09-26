import java.util.Scanner;

public class Task2_Book {

    private int bookId;
    private int pages;
    private double price;

    public void get() {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        int Id_book = read.nextInt();

        System.out.print("Enter Pages: ");
        int p_book = read.nextInt();

        System.out.print("Enter Price: ");
        double pr_book = read.nextDouble();

        set(Id_book, p_book, pr_book);
    }

     void show() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Pages: " + pages);
        System.out.println("Price: " + price);

    }

     void set(int b, int p, double pr) {
        this.bookId = b;
        this.pages = p;
        this.price = pr;
    }

     void setBookId(int b) {
        this.bookId = b;
    }

     void setPages(int p) {
        this.pages = p;
    }

    void setPrice(double pr) {
        this.price = pr;
    }

    
     int getBookId() {
        return this.bookId;
    }

     int getPages() {
        return this.pages;
    }

     double getPrice() {
        return this.price;
    }
}
