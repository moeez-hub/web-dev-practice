public class Pet {
    private String eyeColor;
    private double age;
    private double weight;
    private String location;

    Pet() {
        this.eyeColor = "null";
        this.age = 0;
        this.weight = 0;
        this.location = "null";
    }

    Pet(String e, double a, double w, String l) {
        this.eyeColor = e;
        this.age = a;
        this.weight = w;
        this.location = l;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getAge() {
        return age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    void display() {
        System.out.println(getEyeColor() + "\n" + getAge() + "\n" + getWeight() + "\n" + getLocation());
    }

    void eat(String foodType) {
        System.out.println("is eating " + foodType);
    }
}

class Cat extends Pet {
    private String furColor;
    private String whiskerColor;
    private double furLength;
    private int toeNumber;

    Cat() {

    }

    Cat(String furColor, String whiskerColor, double furLength, int toeNumber) {
        this.furColor = furColor;
        this.whiskerColor = whiskerColor;
        this.furLength = furLength;
        this.toeNumber = toeNumber;
    }

    Cat(String furColor, String whikerColor, double furLength, int toeNumber, String eyeColor, double age,
            double weight, String location) {
        super(eyeColor, age, weight, location);
        this.furColor = furColor;
        this.whiskerColor = whikerColor;
        this.furLength = furLength;
        this.toeNumber = toeNumber;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setWhiskerColor(String whiskerColor) {
        this.whiskerColor = whiskerColor;
    }

    public String getWhiskerColor() {
        return whiskerColor;
    }

    public void setFurLength(double furLength) {
        this.furLength = furLength;
    }

    public double getFurLength() {
        return furLength;
    }

    public void setToeNumber(int toeNumber) {
        this.toeNumber = toeNumber;
    }

    public int getToeNumber() {
        return toeNumber;
    }

    void display() {
        super.display();
        System.out.println(getFurColor() + "\n" + getWhiskerColor() + "\n" + getFurLength() + "\n" + getToeNumber());
    }

    void purr(int soundLevel) {
        System.out.println("Cat is purring at " + soundLevel);
    }

    void meow() {
        System.out.println("Meow Meow");
    }
}

class Bird extends Pet {
    private String featherColor;
    private double wingSpan;
    private String beakType;
    private boolean canFly;

    Bird() {

    }

    Bird(String featherColor, double wingSpan, String beakType, boolean canFly){
        this.featherColor = featherColor;
        this.wingSpan = wingSpan;
        this.beakType = beakType;
        this.canFly = canFly;
    }
    
    Bird(String eyeColor, double age, double weight, String location, String featherColor, double wingSpan,
            String beakType, boolean canFly) {
        super(eyeColor, age, weight, location);
        this.featherColor = featherColor;
        this.wingSpan = wingSpan;
        this.beakType = beakType;
        this.canFly = canFly;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setBeakType(String beakType) {
        this.beakType = beakType;
    }

    public String getBeakType() {
        return beakType;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    boolean getCanFly() {
        return canFly;
    }

    @Override
    void display() {
        // TODO Auto-generated method stub
        super.display();
        System.out.println(getFeatherColor() + "\n" + getWingSpan() + "\n" + getBeakType() + "\n" + getCanFly());
    }

    void Squawk() {
        System.out.println("Bird is doing squawking");
    }

    void fly() {
        System.out.println("Bird is flying");
    }

    void eat(String foodType) {
        System.out.println("Bird is eating " + foodType);
    }
}

class Fish extends Pet {
    private boolean jawless;
    private boolean dorsalFin;
    private int swimSpeed;

    
    public Fish() {
       
    }

    public Fish(boolean jawless, boolean dorsalFin, int swimSpeed) {
        this.jawless = jawless;
        this.dorsalFin = dorsalFin;
        this.swimSpeed = swimSpeed;
    }

    public Fish(boolean jawless, boolean dorsalFin, int swimSpeed,
            String eyeColor, double age, double weight, String location) {
        super(eyeColor, age, weight, location);
        this.jawless = jawless;
        this.dorsalFin = dorsalFin;
        this.swimSpeed = swimSpeed;
    }

    public void setJawless(boolean jawless) {
        this.jawless = jawless;
    }

    public void setDorsalFin(boolean dorsalFin) {
        this.dorsalFin = dorsalFin;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public boolean getJawless() {
        return jawless;
    }

    public boolean getDorsalFin() {
        return dorsalFin;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void display() {
        super.display();
        System.out.println(getJawless() + "\n"+ getDorsalFin()  +  "\n" + getSwimSpeed());
    }

    public void swim(String direction) {
        System.out.println("Fish is swimming towards: " + direction);
    }

    public void eat(String foodType) {
        System.out.println("Fish is eating: " + foodType);
    }
}