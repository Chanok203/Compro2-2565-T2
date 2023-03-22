import java.util.Scanner;

/**
 * Com Pro 2, 2565-2, Quiz 4 Array of Objects, Feb 2023
 * @author Pinyo Taeprasartsit
 */
class FoodShop {
    String name;
    int nFoods = 0;
    int cap = 5;  // max nFoods in a menu
    String[] menu = new String[cap];
    
    FoodShop(String name) {
        this.name = name;
    }
    
    boolean addFood(String foodName) {
        if(nFoods < cap) {
            menu[nFoods] = foodName;
            nFoods += 1;
            System.out.print(nFoods);
            return true;
        } else {
            System.out.print("-1");
            return false;
        }
    }
    
    void printMenu() {
        System.out.print(name);
        for(int i = 0; i < nFoods; ++i)
            System.out.print(" " + menu[i]);
        System.out.println();
    }
}

public class FoodTiger2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        FoodShop[] fs = new FoodShop[N+1];
        for(int i = 1; i <= N; ++i) {
            String name = scan.next();
            fs[i] = new FoodShop(name);
        }
        
        final int Q = scan.nextInt();
        for(int i = 0; i < Q; ++i) {
            int s = scan.nextInt();
            String foodName = scan.next();
            boolean ret = fs[s].addFood(foodName);
            System.out.println(" " + ret);
        }
        
        for(int i = 1; i <= N; ++i) {
            fs[i].printMenu();
        }
    }
}
