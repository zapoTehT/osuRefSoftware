package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            File file = new File("res/bracket.json");
            JsonNode rootNode = objectMapper.readTree(file);
            for(JsonNode matchNode: rootNode.withArray("Matches")) {
                int matchId = matchNode.get("ID").asInt();
                String team1Acronym = matchNode.get("Team1Acronym").asText();
                String team2Acronym = matchNode.get("Team2Acronym").asText();

                System.out.println("Match ID: " + matchId);
                System.out.println("Team 1 Acronym: " + team1Acronym);
                System.out.println("Team 2 Acronym: " + team2Acronym);
                System.out.println();
            }
        }
        catch(IOException e) {
            System.out.println("haha");
        }
    }
}