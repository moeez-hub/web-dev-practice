public abstract class Shape {
    private String colour;

    Shape() {
        this.colour = "Unknown";
    }

    Shape(String colour) {
        this.colour = colour;
    }

     public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

   abstract void draw();

    abstract double calculateArea();

    abstract double calculatePerimeter(); 
    

   static void printShapes(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            Shape s = shapes[i];

            s.draw();
            System.out.println("Area = " + s.calculateArea());
            System.out.println("Perimeter = " + s.calculatePerimeter());
        }
    }
}

class Circle extends Shape {
    private double x;
    private double y;
    private double radius;

    Circle() {
        super();
        this.x = 0;
        this.y = 0;
        this.radius = 0;
    }

    Circle(double x, double y, String colour, double radius) {
        super(colour);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    void draw() {
        System.out.println(getX() + "\n" + getY() + "\n" + getRadius() + "\n" + getColour());
    }

    double calculateArea() {
        return 3.14 * (radius * radius);
    }

    double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }
}

class Square extends Shape {
    private double length;

    Square() {
        super();
        length = 1;
    }

    Square(double lenght, String colour) {
        super(colour);
        this.length = lenght;

    }

    public void setLength(double lenght) {
        this.length = lenght;
    }

    public double getLength() {
        return length;
    }

    void draw() {
        System.out.println(getLength() + "\n" + getColour());
    }

    double calculateArea() {
        return length * length;
    }

    double calculatePerimeter() {
        return 4 * length;
    }

}

class Rectangle extends Square {
    private double width;

    Rectangle() {
        super();

        width = 2;
    }

    Rectangle(double length, double width, String colour) {
        super(length, colour);
        this.width = width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    void draw() {
        System.out.println(getLength() + "\n" + getWidth() + "\n" + getColour());
    }

    double calculateArea() {
        return getLength() * width;
    }

    double calculatePerimeter() {
        return 2 * (getLength() + width);
    }
}