public class Engine {
    private int engineSize;
    private String engineType;
    private boolean isEngineRunning;
    private int topSpeed;

    Engine(){

    }

    Engine(int engineSize, String engineType, boolean isEngineRunning, int topSpeed){
        this.engineSize = engineSize;
        this.engineType = engineType;
        this.isEngineRunning = isEngineRunning;
        this.topSpeed = topSpeed;
    }

    Engine(Engine e){
        this.engineSize = e.engineSize;
        this.engineType = e.engineType;
        this.isEngineRunning = e.isEngineRunning;
        this.topSpeed = e.topSpeed;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setIsEngineRunning(boolean isEngineRunning) {
        this.isEngineRunning = isEngineRunning;
    }

   public boolean getIsEngineRunning(boolean isEngineRunning){
        return isEngineRunning;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public boolean startEngine(){
        isEngineRunning = true;
        return isEngineRunning;
    }

    public boolean stopEngine(){
        isEngineRunning = false;
        return isEngineRunning;
    }

    public boolean isEngineRunning() {
        return startEngine();
    }

    public void currentEngine(){
        System.out.println("Engine Size : "+ engineSize);
        System.out.println("Engine Type : "+ engineType);
        System.out.println("top Speed : " + topSpeed);
    }

    
}
