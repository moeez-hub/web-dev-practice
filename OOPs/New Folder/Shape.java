public class Shape {
    public void area(){
        System.out.println("area of shape");
    }    
}

class Circle extends Shape{
    @Override
    public void area() {
        System.out.println("area of circle 32.3cm");
    }
}

class Square extends Shape{
    public void area(){
        System.out.println("Area of Square is 32.2 cm");
    }
}
