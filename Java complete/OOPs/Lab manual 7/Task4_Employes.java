public class Task4_Employes {
    String name;
    int idNumber;
    String department;
    String position;

    Task4_Employes() {

    }

    Task4_Employes(String name, int idnumber, String department, String position) {
        this.name = name;
        this.idNumber = idnumber;
        this.department = department;
        this.position = position;
    }

    void display() {
        System.out.println(getName() + "" + getIdNumber() + " " + getDepartment() + " " + getPosition());
    }

    void setName(String n) {
        this.name = n;
    }

    String getName() {
        return this.name;
    }

    void setIdNumber(int i) {
        this.idNumber = i;
    }

    int getIdNumber() {
        return this.idNumber;
    }

    void setDepartment(String d) {
        this.department = d;
    }

    String getDepartment() {
        return this.department;
    }

    void setPosition(String p) {
        this.position = p;
    }

    public String getPosition() {
        return this.position;
    }

    void copy(Task4_Employes e) {
        e.name = this.name;
        e.idNumber = this.idNumber;
        e.department = this.department;
        e.position = this.position;
    }

    public String toString() {
        return this.name + " " + this.idNumber + " " + this.department + "" + this.position;
    }

    boolean compare(Task4_Employes e) {
        return this.name.equals(e.name) && this.idNumber == e.idNumber && this.department.equals(e.department)
                && this.position.equals(e.position);
    }
}
