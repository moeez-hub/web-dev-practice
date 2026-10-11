public class Car {
    String colour;
    int price;

    public String toString(){
        return colour +"\n"+ price;
    }

    public static void main(String[] args){
        Car car1 = new Car();
        car1.colour = "red";
        car1.price = 3232;

        System.out.println(car1);
    }
}
