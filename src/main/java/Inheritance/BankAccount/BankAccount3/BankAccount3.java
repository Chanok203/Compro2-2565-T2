package Inheritance.BankAccount.BankAccount3;

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
            System.out.print(this.balance + " ");
        }
        
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

class Saving extends Account {

    String id = "";
    String tel = "";
    boolean promptPay;

    Saving(String name, String code, double balance) {
        super(name, code, balance);
        this.promptPay = false;
        System.out.println("Saving account");
    }

    @Override
    void printInfo() {
        super.printInfo();
        if (this.promptPay) {
            System.out.print("PromptPay");
            if (this.id.length() > 0) {
                System.out.print(", " + this.id);
            }
            if (this.tel.length() > 0) {
                System.out.print(", " + this.tel);
            }
            System.out.println();
        } else {
            System.out.println("no PromptPay");
        }
    }

    boolean openPromptPay(int type, String value) {
        if (type == 1) {
            if (value.length() != 13) {
                return false;
            }
            this.promptPay = true;
            this.id = value;
            return this.promptPay;
        }

        if (type == 2) {
            if (value.length() != 10) {
                return false;
            }
            this.promptPay = true;
            this.tel = value;
            return this.promptPay;
        }

        return this.promptPay;
    }
}

class FixedDeposit extends Account {

    double fixedAmount;

    FixedDeposit(String name, String code, double balance, double fixedAccount) {
        super(name, code, balance);
        this.fixedAmount = fixedAccount;
        System.out.println("FixedDeposit account with " + this.fixedAmount);
    }

    @Override
    boolean deposit(double money) {
        if (money < this.fixedAmount) {
            System.out.print("deposit less than " + this.fixedAmount + " ");
            return false;
        }
        return super.deposit(money);
    }

}

class CurrentAccount extends Account {

    double overDraft;

    CurrentAccount(String name, String code, double balance, double overDraft) {
        super(name, code, balance);
        this.overDraft = overDraft;
        System.out.println("Current account with overdraft " + this.overDraft);
    }

    @Override
    boolean withdrawn(double money) {
        if (!this.active) {
            return false;
        }
        if (this.balance + this.overDraft < money) {
            return false;
        }
        this.balance -= money;
        System.out.print(this.balance + " ");
        if (this.balance < 0) {
            System.out.print("overdraft ");
        }
        return true;
    }
}

public class BankAccount3 {

    static void testFixedDeposit() {
        FixedDeposit fd = new FixedDeposit("CHANOK", "016", 500.0, 100.0);
        System.out.println(fd.deposit(200.0));
        System.out.println(fd.deposit(100.0));
        System.out.println(fd.deposit(50.0));
    }

    static void testCurrentAccount() {
        CurrentAccount ca = new CurrentAccount("CHANOK", "016", 500.0, 100.0);
        System.out.println(ca.withdrawn(500.0));
        System.out.println(ca.withdrawn(50.0));
        System.out.println(ca.withdrawn(100.0));
    }

    static void process() {
        Scanner scan = new Scanner(System.in);
        Saving sAcc = null;
        FixedDeposit fAcc = null;
        CurrentAccount cAcc = null;
        for (int t = 1; t <= 3; t++) {
            String name = scan.nextLine();
            String code = scan.nextLine();
            double money1 = scan.nextDouble();
            if (t == 1) {
                scan.nextLine();
                sAcc = new Saving(name, code, money1);
            } else if (t == 2) {
                double money2 = scan.nextDouble();
                scan.nextLine(); //Skip the remainder of the double line. 
                fAcc = new FixedDeposit(name, code, money1, money2);

            } else if (t == 3) {
                double money2 = scan.nextDouble();
                scan.nextLine(); // Skip the remainder of the double line. 
                cAcc = new CurrentAccount(name, code, money1, money2);
            }
        }
        int N = scan.nextInt();
        for (int i = 0; i < N; ++i) {
            Account ac = null;
            int type = scan.nextInt();
            if (type == 1) {
                ac = sAcc;
            } else if (type == 2) {
                ac = fAcc;
            } else {
                ac = cAcc;
            }
            
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

    public static void main(String[] args) {
        process();
    }
}