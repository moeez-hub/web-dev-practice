public class Main {
    public static void main(String[] args) {

      System.out.println("\n_____Assignment State_____");
        
      Assignment a = new Assignment("Moeez", 1, 22, 3, 45);
      a.setScore(90.0);
      a.setTotalPoints(13.0);
      a.setTotalWeight(12.0);
        System.out.println(a);

        Assignment a2 = new Assignment("Computer", 2, 22, 13, 40);
        a2.setScore(10.0);
        a2.setTotalPoints(23.0);
        a2.setTotalWeight(10.0);

         Assignment a3 = new Assignment("Physics", 12, 10, 11, 33);
        a3.setScore(10.0);
        a3.setTotalPoints(28.0);
        a3.setTotalWeight(103.0);
        System.out.println("\n______Lab State_____");

        Lab l = new Lab("Computer lab", 3, 12, 5, 67, "Make a Software");
        l.setScore(10.0);
        l.setTotalPoints(9.0);
        l.setTotalWeight(14.0);
        System.out.println(l);

        System.out.println("\n______Project State_____");

        Project p = new Project("House", 3, 24, 8, 34, "Creat a house", "House.txt");
        p.setScore(10.0);
        p.setTotalPoints(20.0);
        p.setTotalWeight(9.0);
        System.out.println(p);
   		
	System.out.println("\n.....Using Array.....");		
Assignment[] array = new Assignment[3];

        array[0] = a;
        array[1] = a2;
        array[2] = a3;
    
        Assignment.showAssignments(array);
	}
}

