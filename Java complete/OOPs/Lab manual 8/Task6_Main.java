public class Task6_Main {
    public static void main(String[] args) {
         Task6_RetailItem r1 = new Task6_RetailItem();
        Task6_RetailItem r2 = new Task6_RetailItem("Jacket", 12, 65.23);
        Task6_RetailItem r3 = r1.create(r2);

        r1.setDescription("Shirt");
        r1.setUnitsOnHand(54);
        r1.setPrice(534.23);

        r1.display();
        r2.display();
        r3.display();

        System.out.println(r1.compare(r2) +"\n"+ r1.isNotEqual(r2));

        r1.copy(r2);
 
        System.out.println(r1.toString() +"\n"+ r2.toString() +"\n"+ r3.toString());
    
    }
    
}
