package ClassProgramming.FindBestDeal.FindBestDeal1;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
class ProductInfo {

    public String name;
    public int minPrice;
    public int maxPrice;

    public ProductInfo(String name, int[] prices) {
        this.name = name;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; ++i) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if (prices[i] > max) {
                max = prices[i];
            }
        }
        this.minPrice = min;
        this.maxPrice = max;
    }

    public void printInfo() {
        System.out.print(this.name);
        System.out.print(" " + this.minPrice);
        System.out.print(" " + this.maxPrice);
        System.out.println();
    }
}

public class PriceRange {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int N = scan.nextInt();
        int[] prices = new int[N];
        for (int i = 0; i < N; ++i) {
            prices[i] = scan.nextInt();
        }
        ProductInfo pInfo = new ProductInfo(name, prices);
        pInfo.printInfo();
    }
}
