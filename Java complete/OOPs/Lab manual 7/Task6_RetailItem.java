public class Task6_RetailItem {
    String description;
    int unitsOnHand;
    double price;

    Task6_RetailItem() {

    }

    Task6_RetailItem(String description, int unitsonHand, double price) {
        this.description = description;
        this.unitsOnHand = unitsonHand;
        this.price = price;
    }

    void display() {
        System.out.println(getDescription() + "\n" + getUnitsOnHand() +"\n" + getPrice());
    }

    void setDescription(String d) {
        this.description = d;
    }

    String getDescription() {
        return this.description;
    }

    void setUnitsOnHand(int u) {
        this.unitsOnHand = u;
    }

    int getUnitsOnHand() {
        return this.unitsOnHand;
    }

    void setPrice(double p) {
        this.price = p;
    }

    double getPrice() {
        return this.price;
    }

    void copy(Task6_RetailItem r) {
        r.description = this.description;
        r.unitsOnHand = this.unitsOnHand;
        r.price = this.price;
    }

    public String toString() {
        return description + " " + unitsOnHand + " " + price;
    }

    boolean compare(Task6_RetailItem r) {
        return this.getDescription().equals(r.getDescription()) && this.getUnitsOnHand() == r.getUnitsOnHand() && this.getPrice() == r.getPrice();
    }
}
