public class Task4_Main {
    public static void main(String[] args) {
        Task4_Employes e1 = new Task4_Employes();
        Task4_Employes e2 = new Task4_Employes("Moeez.", 5445, "Home", "Sleeping");

        e1.setName("Ahmad");
        e1.setIdNumber(3245);
        e1.setDepartment("School");
        e1.setPosition("Accounting");

        e1.display();
        e2.display();

        e1.copy(e2);

        System.out.println(e1 +"\n"+ e2);

        System.out.println(e1.compare(e2));
    }
}
