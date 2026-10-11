public class Task2_Main {
    public static void main(String[] args) {
        Task2_Book math = new Task2_Book();
        Task2_Book english = new Task2_Book();

        System.out.println("Enter Math Book Details:");
        math.get();
      
        math.setBookId(2);
        math.setPages(320);
        math.setPrice(150.75);
        
        System.out.println("Enter english book detail : ");
        english.get();
      
        english.setBookId(2);
        english.setPages(320);
        english.setPrice(150.75);

        System.out.println("The details of costliest book :");
        if(math.getPrice() > english.getPrice()){
            math.show();
        }

        else {
            //  System.out.println("Book ID: " + english.getBookId() +"\n"+ "Pages: " +english.getPages()+ "\n" + "Price :"+ english.getPrice());
            english.show();
        }
    }
}
