public class OOPs_task
{
 
       String brand_name;
       String colour;
       int price;     
    
  public void display() {
        System.out.println(brand_name);
        System.out.println(colour);
        System.out.println(price);
  }      
    public static void main(String[] args) {
        OOPs_task car = new OOPs_task();
          car.brand_name = "BMW";
          car.colour = "Black";
          car.price = 123333;  
       car.display();     
   }





}
