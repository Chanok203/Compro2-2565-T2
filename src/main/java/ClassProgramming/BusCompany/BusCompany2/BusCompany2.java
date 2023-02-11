package ClassProgramming.BusCompany.BusCompany2;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
class Bus {

    String name;
    int type;
    int capacity;
    int currentSeat = 0;
    boolean isActive = true;

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

    boolean reserve(int k) {
        if (k < 1) {
            return false;
        }

        if (this.capacity - this.currentSeat < k) {
            return false;
        }

        if (!this.isActive) {
            return false;
        }

        this.currentSeat += k;
        return true;
    }

    void sendToRepair() {
        this.isActive = false;
    }

    void backToService() {
        this.isActive = true;
    }
}

public class BusCompany2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String id = scan.next();
        int type = scan.nextInt();
        int seats = scan.nextInt();
        Bus b = new Bus(id, type, seats);

        int N = scan.nextInt();
        for (int i = 0; i < N; ++i) {
            int P = scan.nextInt();
            int K = scan.nextInt();
            if (P == 1) {
                b.reserve(K);
            } else if (P == 2) {
                b.sendToRepair();
            } else if (P == 3) {
                b.backToService();
            }
            b.printStats();
        }
    }
}
