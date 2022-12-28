package String;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class SpellChecking1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] dict = new String[N];
        // READ DICTIONARY
        for (int i = 0; i < N; ++i) {
            dict[i] = sc.next();
        }
        // READ WORD
        for (int j = 0; j < 10; ++j) {
            String word = sc.next();
            boolean found = false;
            for (int i = 0; i < N; ++i) {
                String word2 = dict[i];
                boolean eq = word.equals(word2);
                if (eq) {
                    found = true;
                }
                System.out.println(word + " " + word2 + " " + eq + " " + found);
            }
            System.out.println("Found: " + found);
            if (found) {
//                System.out.print("1");
            } else {
//                System.out.print("0");
            }
        }

    }
}
