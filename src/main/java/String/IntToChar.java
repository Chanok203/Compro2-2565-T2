package String;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class IntToChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt();
        if ( 'A' <= code && code <= 'Z') { // [A, Z]
            char c = (char) code;
            System.out.println(c);
        } else {
            System.out.println("unsupported code");
        }
    }
}
