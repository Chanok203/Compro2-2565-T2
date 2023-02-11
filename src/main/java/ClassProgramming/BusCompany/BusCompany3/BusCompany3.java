package ClassProgramming.BusCompany.BusCompany3;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
class Bus {

    String name;
    int type;
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

public class BusCompany3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        Bus[] buses = new Bus[Q];
        for (int q = 0; q < Q; ++q) {
            String name = sc.next();
            int type = sc.nextInt();
            int cap = sc.nextInt();
            buses[q] = new Bus(name, type, cap);
        }
        int N = sc.nextInt();
        for (int n = 0; n < N; ++n) {
            int P = sc.nextInt();
            int K = sc.nextInt();
            int T = sc.nextInt();
            if (P == 1) {
                boolean printed = false;
                for (int q = 0; q < Q; ++q) {
                    if (buses[q].type != T) {
                        continue;
                    }
                    boolean res = buses[q].reserve(K);
                    if (res == true) {
                        System.out.println(buses[q].name);
                        printed = true;
                        break;
                    }
                }
                if (printed == false) {
                    System.out.println("sorry");
                }
            } else if (P == 2) {
                buses[T - 1].sendToRepair();
            } else if (P == 3) {
                buses[T - 1].backToService();
            }
        }
    }
}
