public class Task5_Employes {
    String name;
    int idNumber;
    String department;
    String position;

    void setName(String n){
        this.name = n;
    }
    
    String getName() {
        return this.name;
    }
    
  

    void setIdNumber(int i){
        this.idNumber = i;
    }

    int getIdNumber() {
        return this.idNumber;
    }

    void setDepartment(String d){
        this.department = d;
    }

    String getDepartment() {
        return this.department;
    }
    
    void setPosition(String p){
        this.position = p;
    }

    public String getPosition() {
        return this.position;
    }

    //   void display(){
    //     System.out.println(name +"  "+ IdNumber +"  "+ department +"  "+ position);
    // }
}