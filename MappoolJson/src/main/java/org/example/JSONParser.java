package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;

public class JSONParser {
    private File file;
    private final ObjectMapper objectMapper = new ObjectMapper();
    public void setFileName(String fileName) {
        file = new File(fileName);
    }

    public void parseTeams(ArrayList<Team> teamList) {
        try {
            JsonNode rootNode = objectMapper.readTree(file);
            for(JsonNode teamNode: rootNode.withArray("Teams")) {

                String teamName = teamNode.get("FullName").asText();
                JsonNode players = teamNode.withArray("Players");
                String captain = players.elements().next().get("Username").asText();

                Team newTeam = new Team(teamName, captain);
                teamList.add(newTeam);
            }
        }
        catch(IOException e) {
            System.out.println("IOException has occurred (not the player)");
        }
        catch(NullPointerException e) {
            System.out.println("Null Pointer Exception has occurred (assuming process has finished)");
        }
        catch(NoSuchElementException e) {
            System.out.println("No Such Element Exception has occurred");
        }
    }

}
