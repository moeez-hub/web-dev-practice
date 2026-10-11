class Task extends Module {
    private String taskName;

    Task() {
        super();
        this.taskName = "";
    }

    Task(int projectId, String projectName, String projectLocation, String moduleName, String taskName) {
        super(projectId, projectName, projectLocation, moduleName);
        this.taskName = taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskName() {
        return this.taskName;
    }

    @Override
    public void displayState() {
        super.displayState();
        System.out.println("Task Name: " + this.taskName);
    }
    
}
