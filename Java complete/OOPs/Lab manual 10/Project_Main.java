public class Project_Main {
    public static void main(String[] args) {
        Project p1 = new Project();
        Project p2 = new Project(1341, "House", "Road");
        
        Module m1 = new Module();
        Module m2 = new Module("Computer", 43512, "Room", "In house");
        Module m3 = new Module("Java");

        Task t1 = new Task();
        Task t2 = new Task("Find Even odd", "Solve");
        Task t3 = new Task("Factorization", "Solve", "Decoration", 3452, "Decorate", "House Garden");

    
        p1.setProjectID(23123);
        p1.setProjectName("Company");
        p1.setProjectLocation("In Appartment");


        m1.setModuleName("English");
        m1.setProjectID(1001);
        m1.setProjectName("Science Project");
        m1.setProjectLocation("Lab Room");

        
        t1.setTaskName("Crammer rule");
        t1.setTaskDescription("Solve it");
        t1.setModuleName("Math Module");
        t1.setProjectID(2001);
        t1.setProjectName("Math Project");
        t1.setProjectLocation("Class Room");

        
        t2.setModuleName("CS Module");
        t2.setProjectID(3001);
        t2.setProjectName("CS Project");
        t2.setProjectLocation("Computer Lab");

        
        m3.setProjectID(4001);
        m3.setProjectName("Java Project");
        m3.setProjectLocation("Online");

        System.out.println("______Project States_______");
        p1.displayState();
        p2.displayState();

        System.out.println("______Module States______");
        m1.displayState();
        m2.displayState();
        m3.displayState();

        System.out.println("______Task States______");
        t1.displayState();
        t2.displayState();
        t3.displayState();
    }
}

