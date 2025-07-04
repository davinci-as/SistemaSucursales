package dv.torneo;

import java.util.ArrayList;
import java.util.Date;

public class Season {
    private String name;
    private Date startDate;
    private Date endDate;
    private ArrayList<Match> matches;
    private ArrayList<Team>teams;

    public Season(String name, Date startDate, Date endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.matches = new ArrayList<>(); // Inicializa la lista vacía
        this.teams = new ArrayList<>();   // Inicializa la lista vacía
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name; }

    public Date getStartDate() {return startDate; }

    public void setStartDate(Date startDate) {this.startDate = startDate; }

    public Date getEndDate() {return endDate; }

    public void setEndDate(Date endDate) {this.endDate = endDate; }

    public ArrayList<Match> getMatches() {return matches; }

    public void setMatches(ArrayList<Match> matches) {this.matches = matches; }

    public ArrayList<Team> getTeams() {return teams; }

    public void setTeams(ArrayList<Team> teams) {this.teams = teams;}
}