package Recursion;


import java.util.Scanner;

/**
 *
 * @author Guest-Student
 */
public class ConsecDupRemoval {

    String dupRemove(String str) {
        if (str.length() <= 1) {
            return str;
        }
        char a = str.charAt(0);
        char b = str.charAt(1);
        String keep = "";
        if (a != b) {
            keep += a;
        }
        String next = str.substring(1);
        
//        System.out.println(str + " => " + keep + " + dupRemove(" + next + ")");
        return keep + dupRemove(next);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
//        String str = "abbcc";
        String result = (new ConsecDupRemoval()).dupRemove(str);
        System.out.print(result);
    }
}
