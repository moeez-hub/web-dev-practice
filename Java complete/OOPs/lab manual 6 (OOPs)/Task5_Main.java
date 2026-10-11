public class Task5_Main {
    public static void main(String[] args) {
        Task5_Employes e1 = new Task5_Employes();
        Task5_Employes e2 = new Task5_Employes();
        Task5_Employes e3 = new Task5_Employes();

        e1.setName("Mr Ali");
        e1.setIdNumber(47899);
        e1.setDepartment("Accounting");
        e1.setPosition("Voice President");

        e2.setName("Baber Jameel");
        e2.setIdNumber(39119);
        e2.setDepartment("IT");
        e2.setPosition("Programmer");

        e3.setName("Rida Naeem");
        e3.setIdNumber(81774);
        e3.setDepartment("Manufacturing");
        e3.setPosition("Engineer");

        System.out.println("Name" + "        | " + "IdNumber" + " |  " + "Department" + "    |  " + "Position");
        System.out.println(e1.getName() + "         " + e1.getIdNumber() + "     " + e1.getDepartment() + "       " + e1.getPosition());
        System.out.println(e2.getName() + "   " + e2.getIdNumber() + "     " + e2.getDepartment() + "               " + e2.getPosition());
        System.out.println(e3.getName() + "     " + e3.getIdNumber() + "     " + e3.getDepartment() + "    " + e3.getPosition());
    }
}
