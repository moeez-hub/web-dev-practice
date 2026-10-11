class Module extends Project {
    private String moduleName;

    Module() {
        super();
        this.moduleName = "";
    }

    Module(int projectId, String projectName, String projectLocation, String moduleName) {
        super(projectId, projectName, projectLocation);
        this.moduleName = moduleName;
    }


    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleName() {
        return this.moduleName;
    }

    @Override
    public void displayState() {
        super.displayState();
        System.out.println("Module Name: " + this.moduleName);
    }
    
}
