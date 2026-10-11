public class Task4_Main {
    public static void main(String[] args) {
        Task4_Employes e1 = new Task4_Employes("Ali", 9878, "IT", "Manager");
        Task4_Employes e2 = new Task4_Employes();

        e2.setName("Moeez");
        e2.setIdNumber(5454);
        e2.setDepartment("Sleeping center");
        e2.setPosition("Home");

        e1.display();
        e2.display();

        System.out.println(e1.compare(e2) +"\n"+ e1.isNotEqual(e2));
        System.out.println(e1.toString() +"\n"+ e2.toString());

        e1.copy(e2);

        Task4_Employes e3 = e1.create(e2);

        System.out.println(e3.toString());
    }   
}
