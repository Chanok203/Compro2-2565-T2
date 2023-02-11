package ClassProgramming.FindBestDeal.FindBestDeal2;

import java.util.ArrayList;
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

class Store {

    private ArrayList<ProductInfo> products = new ArrayList<>();

    void enterProductInfo(Scanner scan) {
        String name = scan.next();
        int N = scan.nextInt();
        int[] prices = new int[N];
        for (int i = 0; i < N; ++i) {
            prices[i] = scan.nextInt();
        }
        ProductInfo pInfo = new ProductInfo(name, prices);
        this.products.add(pInfo);
    }

    void printAllProductInfo() {
        int L = this.products.size();
        for (int i = 0; i < L; ++i) {
            ProductInfo pInfo = this.products.get(i);
            pInfo.printInfo();
        }
    }
}

public class StoreAndInsert {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Store store = new Store();
        int K = scan.nextInt();
        for (int i = 0; i < K; ++i) {
            store.enterProductInfo(scan);
        }
        store.printAllProductInfo();
    }
}
