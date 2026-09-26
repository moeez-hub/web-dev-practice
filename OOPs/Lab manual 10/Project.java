public class Project {
    private int projectID;
    private String projectName;
    private String projectLocation;

    Project(){

    }

    Project(int id, String name, String location){
        this.projectID = id;
        this.projectName = name;
        this.projectLocation = location;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    public int getProjectID() {
        return projectID;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectLocation(String projectLocation) {
        this.projectLocation = projectLocation;
    }

    public String getProjectLocation() {
        return projectLocation;
    }

    void displayState(){
        System.out.println(getProjectID() +"\n"+ getProjectName() +"\n"+ getProjectLocation());
    }

}

class Module extends Project{
    private String moduleName;

    Module(){

    }

    Module(String name){
        this.moduleName = name;
    }

    Module(String moduleName, int projectID, String projectName, String projectLocation){
        super(projectID, projectName, projectLocation);
        this.moduleName = moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleName() {
        return moduleName;
    }

    @Override
    void displayState() {
        // TODO Auto-generated method stub
        super.displayState();
        System.out.println(getModuleName());
    }
}

class Task extends Module{
    private String taskName;
    private String taskDescription;

    Task(){

    }

    Task(String taskName, String taskDes){
        this.taskName = taskName;
        this.taskDescription = taskDes;
    }

    Task(String taskName, String taskDes, String moduleName, int projectID, String projectName, String projectLocation){
        super(moduleName, projectID, projectName, projectLocation);
        this.taskName = taskName;
        this.taskDescription = taskDes;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    @Override
    void displayState() {
        // TODO Auto-generated method stub
        super.displayState();
        System.out.println(getTaskName() +"\n"+ getTaskDescription());
    }
}