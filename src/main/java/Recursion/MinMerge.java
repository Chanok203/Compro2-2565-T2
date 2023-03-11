package Recursion;
import java.util.Scanner;



/**
 *
 * @author Guest-Student
 */
public class MinMerge {
    
    static String merge(String str1, String str2) {
        if (str1.length() == 0) {
            return str2;
        }
        if (str2.length() == 0) {
            return str1;
        }
        
        char a = str1.charAt(0);
        char b = str2.charAt(0);
        char min = (a < b) ? a : b;
        String next1 = str1.substring(1);
        String next2 = str2.substring(1);
        return min + merge(next1, next2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        
        String merged = merge(str1, str2);
        System.out.println(merged);
    }
}
