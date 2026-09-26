public class Shape_Main {
    public static void main(String[] args) {
        Shape[] s = new Shape[3];

        s[0] = new Square();
        s[1] = new Circle();
        s[2] = new Circle();

        for(int i=0; i < s.length; i++){
            s[i].area();
        }
    }
}
