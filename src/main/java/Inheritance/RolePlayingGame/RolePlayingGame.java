package Inheritance.RolePlayingGame;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
class GameCharacter {
    String name;
    int attack;
    int defense;
    int level;
    
    void stat() {
        System.out.print(this.name);
        System.out.print(" " + this.level);
        System.out.print(" " + this.attack);
        System.out.print(" " + this.defense);
        System.out.println();
    }
}

class Hero extends GameCharacter {
    Hero(String name) {
        this.name = name;
        this.attack = 10;
        this.defense = 5;
        this.level = 1;
    }
    
    void hit(Monster monster) {
        int score = monster.score;
        int lv = score / 100;
        this.attack += lv * 3;
        this.defense += lv * 2;
        this.level += lv;
    }
}

class Monster extends GameCharacter {
    int score;
    Monster(String name, int level, int score) {
        this.name = name;
        this.level = level;
        this.score = score;
        this.attack = level * 2;
        this.defense = level * 3;
    }
}

public class RolePlayingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read Hero
        int M = sc.nextInt();
        Hero[] heroes = new Hero[M];
        for (int m = 0; m < M; ++m) {
            String name = sc.next();
            heroes[m] = new Hero(name);
        }
        
        // Read Monster
        int N = sc.nextInt();
        Monster[] monsters = new Monster[N];
        boolean[] alive = new boolean[N];
        for (int n = 0; n < N ; ++n) {
            int lv = sc.nextInt();
            int score = sc.nextInt();
            String name = (n+1) + "";
            monsters[n] = new Monster(name, lv, score);
            alive[n] = true;
        }
        
        int K = sc.nextInt();
        for (int k = 0; k < K; ++k) {
            int heroIdx = sc.nextInt() - 1;
            int monsIdx = sc.nextInt() - 1;
            Hero h = heroes[heroIdx];
            Monster m = monsters[monsIdx];
            if (alive[monsIdx] == false) {
                continue;
            }
            
            h.hit(m);
            alive[monsIdx] = false;
        }
        
        for (int m = 0; m < M ; ++m) {
            heroes[m].stat();
        }
    }
}