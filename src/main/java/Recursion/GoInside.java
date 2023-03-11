package Recursion;

import java.util.Scanner;

public class GoInside {

    String goInside(String str, boolean front) {
        int L = str.length();
        if (L <= 1) {
            return str;
        }
        char first = str.charAt(0);
        char last = str.charAt(L - 1);
        String res = (front)
                ? first + "" + last
                : last  + "" + first;
        String next = str.substring(1, L-1);
        return res + goInside(next, !front);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        GoInside gi = new GoInside();
        String answer = gi.goInside(str, true);
        System.out.println(answer);
    }
}
