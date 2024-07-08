package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Round {
    private String roundName;
    private ArrayList<osuMap> mapPool = new ArrayList<>();
    private HashMap<String,Integer> modCounts = new HashMap<>();

    public Round(String roundName) {
        this.roundName = roundName;
    }

    public void addMap(osuMap map) {
        if(modCounts.containsKey(map.getMod())) {
            int count = modCounts.get(map.getMod());
            modCounts.put(map.getMod(), count + 1);
            map.setMapSlot(count + 1);
            mapPool.add(map);
        }
        else {
            modCounts.putIfAbsent(map.getMod(), 1);
            map.setMapSlot(1);
            mapPool.add(map);
        }
    }

    public void printMaps() {
        for(osuMap map : mapPool) {
            System.out.println(map.getMap());
        }
    }
}
