package org.example;

public class RoundTest {
    public static void main(String[] args) {
        Round round = new Round("Round of 16");
        osuMap NM1 = new osuMap("123445", "NM");
        osuMap NM2 = new osuMap("234234", "NM");
        round.addMap(NM1);
        round.addMap(NM2);
        round.printMaps();
    }
}
