public class Task10_Substance {
    int temperature;

    // Task10_Substance(int temp) {
    //     this.temperature = temp;
    // }

    boolean isEthylFreezing() {
        return this.temperature <= -173;
    }

    boolean isEthylBoiling() {
        return this.temperature >= 172;
    }

    boolean isOxygenBoiling(){
        return this.temperature >= -306;
    }

    boolean isOxygenFreezing(){
        return this.temperature <= -362;
    }

    boolean isWaterBoiling(){
        return this.temperature >= 212; 
    }

    boolean isWaterFreezing(){
        return this.temperature <= 32;
    }

    
}
