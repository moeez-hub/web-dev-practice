public class Engine {
   private int horsPower;
   private String type;
   private int cylinder;
   private  boolean isRunning;
   
   Engine(int horsPower, String type, int cylinder){
    this.horsPower = horsPower;
    this.type = type;
    this.cylinder = cylinder;
   }

   void start(){
    isRunning = true;
    System.out.print("Start");
   }

   void stop(){
    isRunning = false;
    System.out.println("Stop");
   }

   public int getHorsPower() {
       return horsPower;
   }

   public int getCylinder() {
       return cylinder;
   }

   public String getType() {
       return type;
   }
   public String toString(){
    return horsPower +"\n"+ type +"\n"+ cylinder;
   }

}
