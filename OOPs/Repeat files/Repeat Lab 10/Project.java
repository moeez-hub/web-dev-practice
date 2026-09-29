public class Project {
private int projectId;
private String projectName;
private String projectLocation;

Project() {
    this.projectId = 0;
    this.projectName = "";
    this.projectLocation = "";
}

Project(int projectId, String projectName, String projectLocation) {
    this.projectId = projectId;
    this.projectName = projectName;
    this.projectLocation = projectLocation;
}

public void setProjectId(int projectId) {
    this.projectId = projectId;
}

public int getProjectId() {
    return this.projectId;
}

public void setProjectName(String projectName) {
    this.projectName = projectName;
}

public String getProjectName() {
    return this.projectName;
}

public void setProjectLocation(String projectLocation) {
    this.projectLocation = projectLocation;
}

public String getProjectLocation() {
    return this.projectLocation;
}

public void displayState() {
    System.out.println("Project ID: " + this.projectId);
    System.out.println("Project Name: " + this.projectName);
    System.out.println("Project Location: " + this.projectLocation);
}


}
