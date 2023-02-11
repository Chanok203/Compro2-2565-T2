package ClassProgramming.BusCompany.BusCompany1;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */

import java.util.Scanner;

class Bus {

    private String name;
    private int type;
    private int capacity;
    private int currentSeat = 0;
    private boolean isActive = true;

    public Bus(String name, int type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    void printStats() {
        System.out.println(this.name);

        if (this.type == 1) {
            System.out.println("Fan");
        } else if (this.type == 2) {
            System.out.println("P1");
        } else {
            System.out.println("VIP");
        }
        
        System.out.println(this.currentSeat + " " + this.capacity);
        
        if (this.isActive) {
            System.out.println("Active");
        } else {
            System.out.println("Inactive");
        }
    }
}

public class BusCompany1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String id = scan.next();
        int type = scan.nextInt();
        int seats = scan.nextInt();
        Bus b = new Bus(id, type, seats);
        b.printStats();
    }
}
