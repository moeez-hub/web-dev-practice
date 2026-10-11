public class Assignment {
    private String name;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private double score;
    private double totalPoints;
    private double totalWeight;

    public Assignment(String name, int month, int day, int hour, int minute) {
        this.name = name;
        this.month = month;
        this.hour = hour;
        this.day = day;
        this.minute = minute;
    }

    public String getName() {
        return name;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setScore(double score) {
        this.score = score;
    }
    
    public double getScore() {
        return score;
    }

    public void setTotalPoints(double totalPoints) {
        this.totalPoints = totalPoints;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public double getTotalPoints() {
        return totalPoints;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public String toString() {
        return "Name : " + getName() + "\n" + "Month :" + getMonth() + "\n" + "Hour : " + getHour() + "\n" + "Minute : "
                + getMinute()
                + "\n" + "Score : " + getScore() + "\n" + "Total Points : " + getTotalPoints() + "\n"
                + "Total Weights : " + getTotalWeight();
    }

    public static void showAssignments(Assignment[] assignments){
        for(int i = 0; i < assignments.length; i++){
            System.out.println(assignments[i].toString());
        }
    } 
}
