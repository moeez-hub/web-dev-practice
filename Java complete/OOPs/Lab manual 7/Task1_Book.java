public class Task1_Book{
    private int bookId;
    private int pages;
    private double price;

    Task1_Book(){

    }
    
    Task1_Book(int b){
        this.bookId = b;
    }

    Task1_Book(int p, double price){
        this.pages = p;
        this.price = price;
    }

    Task1_Book(int b, int p, double price){
        this.bookId = b;
        this.pages = p;
        this.price = price;
    }

    void display(){
        System.out.println(getBookId() +"\n"+ getPages() +"\n"+ getPrice());
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getBookId() {
        return this.bookId;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return this.pages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    boolean isLarger(Task1_Book b){
        return this.pages > b.pages;
    }

    boolean isExpensive(Task1_Book b){
        return this.price > b.price;
    }

    void copy(Task1_Book b){
        b.bookId = this.bookId;
        b.pages = this.pages;
        b.price = this.price;
    }

    public String toString(){
        return this.bookId +" "+ this.pages +" "+ this.price;  
    }
}