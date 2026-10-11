public class Task7_Main {
    public static void main(String[] args) {
        Task7_RetailItem i1 = new Task7_RetailItem();
        Task7_RetailItem i2 = new Task7_RetailItem();
        Task7_RetailItem i3 = new Task7_RetailItem();

        i1.setDescription("Jacket");
        i1.setUnitsOnHand(12);
        i1.setPrice(59.95);
    
         i2.setDescription("Designer jeans");
        i2.setUnitsOnHand(40);
        i2.setPrice(34.95);
    
         i3.setDescription("Shirt");
        i3.setUnitsOnHand(20);
        i3.setPrice(24.95);
        System.out.println("        " + "Description" + "      Units On Hand" + "     Price");
        System.out.println("Item 1: " + i1.getDescription() +"             "+ i1.getUnitsOnHand() +"              "+ i1.getPrice());
        System.out.println("Item 2: " + i2.getDescription() +"     "+ i2.getUnitsOnHand() +"              "+ i2.getPrice());
        System.out.println("Item 3: " + i3.getDescription() +"              "+ i3.getUnitsOnHand() +"              "+ i3.getPrice());
    }
}
