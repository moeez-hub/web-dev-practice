public class RunBox3D {
    public static void main(String[] args) {
        
        Box3D[] b = new Box3D[6];

        Box3D b1 = new Box3D();
        Box3D b2 = new Box3D(5.21, 3.54, 6.43, "Red");
        Box3D b3 = new Box3D(7.43, 4.132, 6.21, "Pink");
        Box3D b4 = new Box3D(23.4, 43.23, 45.2, "Green");
        Box3D b5 = new Box3D(21.12, 4.54, 8.5, "Yellow");
        Box3D b6 = new Box3D(b4);
        
        b1.setLength(34.21);
        b1.setWidth(12.21);
        b1.setHeight(4.21);
        b1.setColour("Black");

        b[0] = b1;
        b[1] = b2;
        b[2] = b3;
        b[3] = b4;
        b[4] = b5;
        b[5] = b6;
       
        Box3D.print(b);

        System.out.println(b[5].isEqual(b[3]));
    
        System.out.println(Box3D.linearSearch(b, "Yellow"));
   
        Box3D.sort(b);
        System.out.println("After Sorting");
        Box3D.print(b);

        System.out.println("Area greater then 41");
        Box3D.search(b, 41.22);
    
    }
}
