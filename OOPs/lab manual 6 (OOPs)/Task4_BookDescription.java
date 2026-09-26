public class Task4_BookDescription {
    private String title;
    private String author;
    private String publisher;
    private int copiesSold;

    void setTitle(String t){
        this.title = t;
    }

    String getTitle() {
        return title;
    }

    void setAuthor(String a){
        this.author = a;
    }

    String getAuthor(){
        return this.author;
    }

    void setPublisher(String p){
        this.publisher = p;
    }

    String getPublisher(){
        return this.publisher;
    }

    void setCopiesSold(int c){
        this.copiesSold = c;
    }

     int getCopiesSold() {
        return this.copiesSold;
    } 
}
