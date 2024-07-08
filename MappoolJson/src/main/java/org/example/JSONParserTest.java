package org.example;

import java.util.ArrayList;

public class JSONParserTest {

    public static void main(String[] args) {
        ArrayList<Team> teams = new ArrayList<>();
        JSONParser jsonParser = new JSONParser();
        jsonParser.setFileName("res/bracket.json");
        jsonParser.parseTeams(teams);

        for(Team team: teams) {
            System.out.println("Team: " + team.getTeamName());
            System.out.println("Captain: " + team.getCaptainName());
            System.out.println();
        }
    }
}
