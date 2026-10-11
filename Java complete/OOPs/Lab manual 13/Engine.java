public class Engine {
    private int engineSize;
    private String engineType;
    private boolean engineRunning;
    private int topSpeed;

    Engine() {

    }

    Engine(int engineSize, String engineType, boolean engineRunning, int topSpeed) {
        this.engineSize = engineSize;
        this.engineType = engineType;
        this.engineRunning = engineRunning;
        this.topSpeed = topSpeed;
    }

    Engine(Engine e) {
        this.engineSize = e.engineSize;
        this.engineType = e.engineType;
        this.engineRunning = e.engineRunning;
        this.topSpeed = e.topSpeed;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineRunning(boolean engineRunning) {
        this.engineRunning = engineRunning;
    }

    public boolean getEngineRunning() {
        return engineRunning;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public boolean engineStart() {
        engineRunning = true;
        return engineRunning;
    }

    public boolean engineStop() {
        engineRunning = false;
        return engineRunning;
    }


    public void currentEngineState() {
        System.out.println("Engine Size : " + engineSize);
        System.out.println("Engine Type : " + engineType);
        System.out.println("top Speed : " + topSpeed);
    }

}
