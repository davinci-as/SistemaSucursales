package dv.torneo;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;

    public Team(String name){
        this.setName(name);
        this.setPlayers(new ArrayList<>());
    }

    public Team (String name, ArrayList<Player>players) {
        this.setName(name);
        this.setPlayers(players);
    }

    public String getName () { return name; }

    public void setName(String name) {this.name = name;}

    public ArrayList<Player> getPlayers() {return players; }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players; }

    public void addPlayer(Player player) {
        this.players.add(player);
    }
}
