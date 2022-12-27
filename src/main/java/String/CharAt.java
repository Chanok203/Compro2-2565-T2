package String;

import java.util.Scanner;

public class CharAt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        int index = sc.nextInt() - 1;

        // 0 1 2 3  ...                                     L-1
        // 0 1 2 3 4 5 6 7 8  9  10 11 12 13 14 15 16 17 18 19
        // S i l p a k o r n ' '  U  n i  v  e  r  s  i  t  y
        int L = msg.length();
        if (index < 0 || L <= index) { // (-inf, 0) U [L, inf)
            System.out.println("invalid position");
        } else {
            char c = msg.charAt(index);
            System.out.println(c);
        }
    }
}
