package dv.torneo;

public class Player {
    private int number;
    private String name;
    private String position;
    private int goalCounter;

    public Player(int number, String name, String position,int goalCounter) {
        this.setNumber(number);
        this.setName(name);
        this.setPosition(position);
        this.setGoalCounter(goalCounter);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getGoalCounter() {
        return goalCounter;
    }

    public void setGoalCounter(int goalCounter) {
        this.goalCounter = goalCounter;
    }

}
