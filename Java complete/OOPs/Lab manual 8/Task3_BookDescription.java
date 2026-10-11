public class Task3_BookDescription {
    private String title;
    private String author;
    private String publisher;
    private int copiesSold;

    Task3_BookDescription() {

    }

    Task3_BookDescription(String title, String author, String publisher, int copiesSold) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copiesSold = copiesSold;
    }

    void display() {
        System.out.println(getTitle() + " " + getAuthor() + " " + getPublisher() + " " + getCopiesSold());
    }

    void setTitle(String t) {
        this.title = t;
    }

    String getTitle() {
        return title;
    }

    void setAuthor(String a) {
        this.author = a;
    }

    String getAuthor() {
        return this.author;
    }

    void setPublisher(String p) {
        this.publisher = p;
    }

    String getPublisher() {
        return this.publisher;
    }

    void setCopiesSold(int c) {
        this.copiesSold = c;
    }

    int getCopiesSold() {
        return this.copiesSold;
    }

    boolean isMorePopular(Task3_BookDescription b) {
        return this.copiesSold > b.copiesSold;
    }

    void copy(Task3_BookDescription b) {
        b.title = this.title;
        b.author = this.author;
        b.publisher = this.publisher;
        b.copiesSold = this.copiesSold;
    }

    public String toString() {
        return this.getTitle() + " " + this.getAuthor() + " " + this.getPublisher() + " " + this.getCopiesSold();
    }

    boolean compare(Task3_BookDescription b) {
        return this.title.equals(b.title) && this.author.equals(b.author) && this.publisher.equals(b.publisher)
                && this.copiesSold == b.copiesSold;

    }

    boolean notEqual(Task3_BookDescription b) {
        return !this.title.equals(b.title) && !this.author.equals(b.author) && !this.publisher.equals(b.publisher)
                && this.copiesSold != b.copiesSold;

    }

    Task3_BookDescription create(Task3_BookDescription b){
        String newT = this.title + b.title;
        String newP = this.publisher + b.publisher;
        String newA = this.author + b.author;
        int newC = this.copiesSold + b.copiesSold;
        return new Task3_BookDescription(newT, newP, newA, newC);
    }
}
