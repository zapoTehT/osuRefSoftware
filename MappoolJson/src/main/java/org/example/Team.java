package org.example;

public class Team {
    private final String teamName;
    private final String captainName;
    public Team(String teamName, String captainName) {
        this.teamName = teamName;
        this.captainName = captainName;
    }

    public String getCaptainName() {
        return captainName;
    }

    public String getTeamName() {
        return teamName;
    }

}
