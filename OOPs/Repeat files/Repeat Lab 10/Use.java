public class Use {
    public static void main(String[] args) {
     
        Project project = new Project(1, "Car", "Gujranwala");
        project.displayState();

        Module module = new Module(4, "Second car", "Faisalabad", "Working on car");
        module.displayState();
    
        Task task = new Task(2, "Dadu operation", "Science lab", "Working at dadu", "dadu");
        task.displayState();
    }
    
}
