public class Book {
    private int bookId;
    private int pages;
    private double price;

    Book() {

    }

    Book(int bookId) {
        this.bookId = bookId;
    }

    Book(int bookId, int pages) {
        this.bookId = bookId;
        this.pages = pages;
    }

    Book(int bookId, int pages, double price) {
        this.bookId = bookId;
        this.pages = pages;
        this.price = price;
    }

    public void display() {
        System.out.println("Book Id : " + this.bookId);
        System.out.println("Book pages : " + this.pages);
        System.out.println("Book price : " + this.price);
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    boolean isLarger(Book b) {
        return this.pages > b.pages;
    }

    boolean isExpensive(Book b) {
        return this.price > b.price;
    }

    void copy(Book b) {
        b.bookId = this.bookId;
        b.pages = this.pages;
        b.price = this.price;
    }

    public String toString() {
        return "BookId : " + this.getBookId() + "\nPages : " + this.getPages() + "\nPrice : " + this.getPrice();
    }

    public boolean isEqual(Book b) {
        return this.bookId == b.bookId
                && this.pages == b.pages
                && this.price == b.price;
    }

    public Book create(Book b) {
        int newid = this.bookId + b.bookId;
        int newpages = this.pages + b.pages;
        double newprice = this.price + b.price;

        return new Book(newid, newpages, newprice);
    }

}