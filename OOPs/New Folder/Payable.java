public  interface Payable {
    void pay();
}

class Employee implements Payable{
    public void pay(){
        System.out.println("Fixed salary 5000");
    }
}

class Freelancer implements Payable{
    public void pay(){
        System.out.println("Per project 200");
    }
}