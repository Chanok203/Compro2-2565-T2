package String;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class ZeroOrMore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        
        int index = str1.indexOf("*");
        
        int ignoreLeft = index;
        int ignoreRight = str1.length() - index - 1;
        
        int start = ignoreLeft;
        int stop = str2.length() - ignoreRight;
        
        for (int i = start; i < stop; ++i) {
            System.out.print(str2.charAt(i));
        }
        System.out.println();
    }
}