package Inheritance.BankAccount.BankAccount1;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
class Account {

    String name;
    String code;
    double balance;
    boolean active;

    public Account(String name, String code, double balance) {
        this.name = name;
        this.code = code;
        this.balance = balance;
        this.active = true;
        System.out.println("Open account");
    }
    
    void printInfo() {
        System.out.printf(
                "%s, %s, %s, %s\n",
                this.name,
                this.code,
                this.balance + "",
                (this.active) ? "active" : "inactive"
        );
    }
    
    double checkBalance() {
        return this.balance;
    }
    
    void closeAccount() {
        this.active = false;
        this.printInfo();
    }

    boolean deposit(double money) {
        if (this.active) {
            this.balance += money;
        }
        System.out.print(this.balance + " ");
        return this.active;
    }
    
    boolean withdrawn(double money) {
        if (!this.active) {
            return false;
        }
        if (this.balance < money) {
            return false;
        }
        this.balance -= money;
        System.out.print(this.balance + " ");
        return true;
    } 
}

public class BankAccount1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String code = scan.nextLine();
        double money = scan.nextDouble();
        /* Your Code: create Account object*/
        Account ac = new Account(name, code, money);
        int N = scan.nextInt();
        for (int i = 0; i < N; ++i) {
            int oper = scan.nextInt();
            if (oper == 1) {
                ac.printInfo();
            } else if (oper == 2) {
                double b = ac.checkBalance();
                System.out.println(b);
            } else if (oper == 3) {
                ac.closeAccount();
            } else if (oper == 4) {
                double b = scan.nextDouble();
                boolean res = ac.deposit(b);
                System.out.println(res);
            } else if (oper == 5) {
                double b = scan.nextDouble();
                boolean res = ac.withdrawn(b);
                System.out.println(res);
            }
        }
    }
}