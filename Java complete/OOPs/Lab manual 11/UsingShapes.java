// import javafx.scene.shape.Circle;
// import javafx.scene.shape.Rectangle;

public class UsingShapes {
    public static void main(String[] args) {

        
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.0, 3.3, "Red", 5.7);

        c1.setRadius(10.0);
        c1.setX(4.0);
        c1.setY(6.0);
        c1.setColour("Navy");
        

        c1.draw();
        System.out.println("Area = " + c1.calculateArea());
        System.out.println("Perimeter = " + c1.calculatePerimeter());
     

        c2.draw();
        System.out.println("Area = " + c2.calculateArea());
        System.out.println("Perimeter = " + c2.calculatePerimeter());
       

        Square s1 = new Square();
        Square s2 = new Square(4.0, "Blue");
         
        s1.setLength(8.0);
        s1.setColour("Gray");

        s1.draw();
        System.out.println("Area = " + s1.calculateArea());
        System.out.println("Perimeter = " + s1.calculatePerimeter());
    

        s2.draw();
        System.out.println("Area = " + s2.calculateArea());
        System.out.println("Perimeter = " + s2.calculatePerimeter());
       
    
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(6.0, 3.9, "Green");
       
        r1.setLength(8.0);
        r1.setWidth(5.0);
        r1.setColour("BlueBlack");

        r1.draw();
        System.out.println("Area = " + r1.calculateArea());
        System.out.println("Perimeter = " + r1.calculatePerimeter());
       

        r2.draw();
        System.out.println("Area = " + r2.calculateArea());
        System.out.println("Perimeter = " + r2.calculatePerimeter());
        

       

        // System.out.println("After Changing State:");
        // c1.draw();
        // s1.draw();
        // r1.draw();

        
        Shape[] shapes = new Shape[6];

        shapes[0] = c1;
        shapes[1] = c2;
        shapes[2] = s1;
        shapes[3] = s2;
        shapes[4] = r1;
        shapes[5] = r2;

        System.out.println("\nUsing printShapes Method:");
        Shape.printShapes(shapes);
    }

    }

