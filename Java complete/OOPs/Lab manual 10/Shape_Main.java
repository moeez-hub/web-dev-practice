public class Shape_Main {
    public static void main(String[] args) {
        Shape s = new Shape("Red");
        Shape s2 = new Shape();

        s2.setColour("Black");

        Circle c = new Circle();
        Circle c2 = new Circle(3.12, 32.2, "Yellow", 4.34);

        c.setX(3.21);
        c.setY(4.23);
        c.setColour("Green");
        c.setRadius(6.43);

        Square sqr = new Square();
        Square sqr2 = new Square(4.23, "Blue");

        sqr.setLength(6.45);
        sqr.setColour("Dark blue");

        Rectangle r = new Rectangle();
        Rectangle r2 = new Rectangle(7.34, 23.12, "Navi");

        r.setLength(23.4);
        r.setWidth(44.23);
        r.setColour("Gray");

        System.out.println("Print all state");
        s.draw();
        s2.draw();

        c.draw();
        c2.draw();

        sqr.draw();
        sqr2.draw();

        r.draw();
        r2.draw();

        System.err.println("Area and Perimeters");

        System.out.println("shape area and perimeter" + "\n" + s.calculateArea() + "\n" + s.calculatePerimeter());
        System.out.println(s2.calculateArea() + "\n" + s2.calculatePerimeter());

        System.out.println("Circle area and perimeter" + "\n" + c.calculateArea() + "\n" + c2.calculatePerimeter());
        System.out.println(c2.calculateArea() + "\n" + c2.calculateArea());

        System.out.println(
                "Square area and perimeter" + "\n" + sqr.calculateArea() + "\n" + sqr.calculatePerimeter() + "\n" +
                        sqr2.calculateArea() + "\n" + sqr2.calculatePerimeter());

        System.out.println("Rectangle area and perimeter" + "\n" + r.calculateArea() + "\n" + r.calculatePerimeter()
                + "\n" + r2.calculateArea() + "\n" + r2.calculatePerimeter());
    }
}
