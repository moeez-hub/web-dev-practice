package task2;

class SkateBoard extends Vehicle {
private double boardLength;
private int numberOfWheel;

    SkateBoard(){

    }

    SkateBoard(double boardLength, int numberOfWheel){
        this.boardLength = boardLength;
        this.numberOfWheel = numberOfWheel;
    }

    SkateBoard(String brand, String model, double boardLength, int numberOfWheel){
        super(brand, model);
        this.boardLength = boardLength;
        this.numberOfWheel = numberOfWheel;
    }

    public void setBoardLength(double boardLength) {
        this.boardLength = boardLength;
    }

    public double getBoardLength() {
        return boardLength;
    }

    public void setNumberOfWheel(int numberOfWheel) {
        this.numberOfWheel = numberOfWheel;
    }

    public int getNumberOfWheel() {
        return numberOfWheel;
    }

    public void display(){
      
        super.display();
        System.out.println("Length : "+ getBoardLength() +"\nWheels : "+ getNumberOfWheel());
   }
}