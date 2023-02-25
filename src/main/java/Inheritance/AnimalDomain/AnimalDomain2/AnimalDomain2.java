package Inheritance.AnimalDomain.AnimalDomain2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
class Animal {
    // Enter Your Code Here.
    String name;
    int lifeExpect;
    int age;
    boolean wasVaccined = false;
    
    Animal(String name, int lifeExpect) {
        this.name = name;
        this.lifeExpect = lifeExpect;
        this.age = 0;
        String msg = String.format(
                "%s was born with life expectancy %d year(s)"
                , this.name, this.lifeExpect
        );
        System.out.println(msg);
    }
    
    void live(int years) {
        // case 0
        if (this.age == this.lifeExpect) {
            System.out.printf("%s died earlier\n", this.name);
            return;
        }
        // case 1
        int x = this.age + years;
        if (x < this.lifeExpect) {
            if (years == 1) {
                System.out.printf("%s lived %d more year\n", this.name, years);
            } else {
                System.out.printf("%s lived %d more years\n", this.name, years);
            }
            this.age += years;
            return;
        }
        // case 2
        if (x >= this.lifeExpect) {
            int dif = this.lifeExpect - this.age;
            if (dif == 1) {
                System.out.printf("%s lived %d more year and died\n", this.name, dif);
            } else {
                System.out.printf("%s lived %d more years and died\n", this.name, dif);
            }
            this.age = this.lifeExpect;
            return;
        }
    }
    
    boolean isAlive() {
        boolean isDead = (this.age == this.lifeExpect);
        if (isDead) {
            System.out.printf("%s is dead\n", this.name);
        } else {
            System.out.printf("%s is alive\n", this.name);
        }
        return !isDead;
    }
    
    void vaccine() {
        this.wasVaccined = true;
        System.out.printf("%s's life expectancy is now %d year(s)\n", this.name, this.lifeExpect);
    }
}

class Dog extends Animal {    
    public Dog(String name) {
        super(name, 8);
    }
    
    @Override
    void vaccine() {
        if (!this.wasVaccined) {
            int dif = this.lifeExpect - this.age;
            this.lifeExpect += dif;
        }
        super.vaccine();
    }
}

class Turtle extends Animal {
    public Turtle(String name) {
        super(name, 50);
    }
}

class Salmon extends Animal {
    public Salmon(String name) {
        super(name, 4);
    }
}

public class AnimalDomain2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        // Your Code
        ArrayList<Animal> animals = new ArrayList<>();
        
        for (int i = 0; i < N; ++i) {
            int type = scan.nextInt();
            if (type == 1) {
                int t = scan.nextInt();
                String name = scan.next();
                
                // Your Code
                if (t == 1) {
                    Animal a = new Dog(name);
                    animals.add(a);
                }
                else if (t == 2) {
                    Animal a = new Turtle(name);
                    animals.add(a);
                }
                else if (t == 3) {
                    Animal a = new Salmon(name);
                    animals.add(a);
                }
                
                
            } else if (type == 2) {
                int id = scan.nextInt();
                int year = scan.nextInt();
                // Your Code
                Animal a = animals.get(id-1);
                a.live(year);
                
            } else if (type == 3) {
                int id = scan.nextInt();
                // Your Code
                Animal a = animals.get(id-1);
                a.isAlive();
            } else if (type == 4) {
                int id = scan.nextInt();
                Animal a = animals.get(id-1);
                a.vaccine();
            }
        }
    }
}
