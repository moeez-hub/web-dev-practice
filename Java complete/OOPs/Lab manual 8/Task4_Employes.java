public class Task4_Employes {
   private String name;
   private int idNumber;
   private String department;
   private String position;

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
        return this.getName() + " " + this.getIdNumber() + " " + this.getDepartment() + "" + this.getPosition();
    }

    boolean compare(Task4_Employes e) {
        return this.name.equals(e.name) && this.idNumber == e.idNumber && this.department.equals(e.department)
                && this.position.equals(e.position);
    }

    boolean isNotEqual(Task4_Employes e) {
        return !this.name.equals(e.name) && this.idNumber == e.idNumber && !this.department.equals(e.department)
                && !this.position.equals(e.position);
    }

    Task4_Employes create(Task4_Employes e){
        String newN = this.getName() + e.getName();
        int newId = this.getIdNumber() + e.getIdNumber();
        String newD = this.getDepartment() + e.getDepartment();
        String newP = this.getPosition() + e.getPosition();

        return new Task4_Employes(newN, newId, newD, newP);
    }
}


