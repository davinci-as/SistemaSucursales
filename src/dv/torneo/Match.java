package dv.torneo;

import java.util.Date;

public class Match {
    private String location;
    private Date date;
    private Team localTeam;
    private Team visitantTeam;
    private int localGoalCounter;
    private int visitantGoalCounter;

    public Match(String location, Date date, Team localTeam, Team visitantTeam, int localGoalCounter, int visitantGoalCounter){
        this.setLocation(location);
        this.setDate(date);
        this.setLocalTeam(localTeam);
        this.setVisitantTeam(visitantTeam);
        this.setLocalGoalCounter(localGoalCounter);
        this.setVisitantGoalCounter(visitantGoalCounter);
    }

    public Match(String location, Date matchDate, Team localTeam, Team visitantTeam) {
        this.setLocation(location);
        this.setDate(matchDate);
        this.setLocalTeam(localTeam);
        this.setVisitantTeam(visitantTeam);
    }

    public String getLocation() {return location; }

    public void setLocation(String location) {this.location = location; }

    public Date getDate() {return date; }

    public void setDate(Date date) {this.date = date; }

    public Team getLocalTeam() {return localTeam; }

    public void setLocalTeam(Team localTeam) {this.localTeam = localTeam; }

    public Team getVisitantTeam() {return visitantTeam; }

    public void setVisitantTeam(Team visitantTeam) {this.visitantTeam = visitantTeam; }

    public int getLocalGoalCounter() {return localGoalCounter; }

    public void setLocalGoalCounter(int localGoalCounter) {this.localGoalCounter = localGoalCounter; }

    public int getVisitantGoalCounter() {return visitantGoalCounter; }

    public void setVisitantGoalCounter(int visitantGoalCounter) {
        this.visitantGoalCounter = visitantGoalCounter;
    }

    public void makeGoal (Player player, Team team){
        System.out.println("El jugador " + player + "del equipo " + team + "metio un gol." );
    }

    public void localMakeGoal() {
        this.localGoalCounter++;
        //this.setLocalGoalCounter(this.getLocalGoalCounter() + 1);
    }

    public void visitantMakeGoal() {
        this.visitantGoalCounter++;
    }
}
