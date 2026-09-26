public class Pet_Main {
    public static void main(String[] args) {

        Cat c1 = new Cat();
        Cat c2 = new Cat("Orange", "White", 5.0, 20);
        Cat c3 = new Cat("Black", "Black", 2.0, 18, "Blue", 5, 5.0, "Apartment");
        Bird b1 = new Bird();
        Bird b2 = new Bird("Gray", 3.42, "Straight", false);
        Bird b3 = new Bird("Brown", 3, 0.7, "Jungle", "Green", 1.8, "Flat", true);
        Fish f1 = new Fish();
        Fish f2 = new Fish(true, false, 15);
        Fish f3 = new Fish(false, true, 50, "Red", 2, 1.5, "River");

        c1.setFurColor("White");
        c1.setWhiskerColor("Grey");
        c1.setFurLength(3.5);
        c1.setToeNumber(18);
       

        b1.setFeatherColor("Blue");
        b1.setWingSpan(1.2);
        b1.setBeakType("Curved");
        b1.setCanFly(true);
       

        f1.setJawless(false);
        f1.setDorsalFin(true);
        f1.setSwimSpeed(30);
       

        System.out.println("All States");

        c1.display();
        c2.display();
        c3.display();

        b1.display();
        b2.display();
        b3.display();
        
        f1.display();
        f2.display();
        f3.display();

        System.out.println("Calling Methods");

        c1.eat("Fish");
        c1.meow();
        c1.purr(3);

        b1.eat("Seeds");
        b1.Squawk();
        b1.fly();

        f1.eat("Plankton");
        f1.swim("North");

   
    }
}
