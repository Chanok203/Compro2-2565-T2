package Inheritance.Pokimon.Pokimon2;


import java.util.Scanner;

class PokiStats {

    int[] hps;
    int[] attks;
    int[] defends;

    public PokiStats(int[] hps, int[] attks, int[] defends) {
        int L = hps.length;
        this.hps = new int[L];
        this.attks = new int[L];
        this.defends = new int[L];
        for (int i = 0; i < L; ++i) {
            this.hps[i] = hps[i];
            this.attks[i] = attks[i];
            this.defends[i] = defends[i];
        }
    }

}

class Pokimon {

    PokiStats stats;
    String name;
    int level;
    int energy;

    public Pokimon(PokiStats stats, String name, int level) {
        this.stats = stats;
        this.name = name;
        this.level = level;
        this.energy = stats.hps[level];
    }

    int attack() {
        return this.stats.attks[level];
    }

    int defend() {
        return this.stats.defends[level];
    }

}

public class Pokimon2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] hps = new int[6];
        int[] attks = new int[6];
        int[] defends = new int[6];
        // Read PokiStats
        for (int level = 1; level <= 5; ++level) {
            hps[level] = scan.nextInt();
        }
        for (int level = 1; level <= 5; ++level) {
            attks[level] = scan.nextInt();
        }
        for (int level = 1; level <= 5; ++level) {
            defends[level] = scan.nextInt();
        }
        PokiStats stats = new PokiStats(hps, attks, defends);

        // Name, level and object creation
        String name = scan.next();
        int level = scan.nextInt();
        Pokimon mon = new Pokimon(stats, name, level);

        // Write output
        System.out.println(mon.name);
        System.out.println(mon.energy);
        System.out.println(mon.attack());
        System.out.println(mon.defend());

    }
}

