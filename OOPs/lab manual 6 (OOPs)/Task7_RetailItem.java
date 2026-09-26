public class Task7_RetailItem {
   String description;
   int unitsOnHand;
   double price;
   
   void setDescription(String d){
    this.description = d;
   }

   String getDescription() {
       return this.description;
   }

   void setUnitsOnHand(int u){
    this.unitsOnHand = u;
   }

    int getUnitsOnHand() {
       return this.unitsOnHand;
   }

   void setPrice(double p){
        this.price = p;
   }

    double getPrice() {
       return this.price;
   }
}
