package org.example;

public class osuMap {
    private final String beatmapID;
    private final String mod;
    private Integer mapSlot;
    private boolean pickable;

    public osuMap(String beatmapID, String mod) {
        this.beatmapID = beatmapID;
        this.mod = mod;
    }

    public String getBeatmapID() {
        return beatmapID;
    }

    public String getMod() {
        return mod;
    }

    public Integer getMapSlot() {
        return mapSlot;
    }

    public void setMapSlot(int mapSlot) {
        this.mapSlot = mapSlot;
    }
    public String getMap() {
        return mod + mapSlot;
    }

    public boolean isPickable() {
        return pickable;
    }

    public void setPickable(boolean pickable) {
        this.pickable = pickable;
    }
}
