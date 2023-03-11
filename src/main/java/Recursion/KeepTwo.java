package Resursion;

import java.util.Scanner;

public class KeepTwo {

    String keepTwo(String str) {
        int L = str.length();
        if (L == 2) {
            return str;
        }
        String last = str.charAt(L-1) + "";
        String str2 = str.substring(0, L-1);
        int left = str2.indexOf(last);
        int right = str2.lastIndexOf(last);
        if (left == right) {
            return keepTwo(str2) + last;
        }
        return keepTwo(str2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         String str = scan.next();
        KeepTwo kt = new KeepTwo();
        String answer = kt.keepTwo(str);
        System.out.print(answer);
    }
}
