public class Box3D {
    private double length;
    private double width;
    private double height;
    private String colour;

    Box3D() {

    }

    Box3D(double l, double w, double h, String c) {
        this.length = l;
        this.width = w;
        this.height = h;
        this.colour = c;
    }

    Box3D(Box3D b) {
        this.length = b.length;
        this.width = b.width;
        this.height = b.height;
        this.colour = b.colour;

    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    void print() {
        System.out.println("Length : " +getLength() + "\n" + "Width : " + getWidth() + "\n" + "Height : " +getHeight() + "\n" + "Colour : "+ getColour() +"\n"+ "Area : "+ area());
    }

    static void print(Box3D[] b) {
        for (int i = 0; i < b.length; i++) {
            b[i].print();
        }
    }

    boolean isEqual(Box3D b) {
        return this.getLength() == b.getLength() && b.getWidth() == this.getWidth()  && this.getHeight() == b.getHeight()
                && this.getColour().equals(b.getColour());
    }

    double area() {
        return length * width * height;
    }

    static void sort(Box3D[] b) {
        for (int i = 0; i < b.length; i++) {
            int min = i;
            for (int j = i + 1; j < b.length; j++) {
                if (b[j].area() < b[min].area()) {
                    min = j;
                }
            }
            Box3D temp = b[i];
            b[i] = b[min];
            b[min] = temp;
        }
    }

    static int linearSearch(Box3D [] b, String key){
        for(int i=0; i<b.length; i++){
            if(b[i].colour.equals(key)){
                return  i;
            }
        }
            return -1;
    } 

     static void search(Box3D[] b, double key){
        boolean found = false; 
        for(int i = 0; i<b.length; i++){
            if(b[i].area() >= key){
                b[i].print();
                found = true;
            }
        }
            if (!found){
                System.out.println("Not found");
            }
    }
}
