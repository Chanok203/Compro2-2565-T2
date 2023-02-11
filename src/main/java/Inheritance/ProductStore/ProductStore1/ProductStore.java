package Inheritance.ProductStore.ProductStore1;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */

class Product {

    String name;
    String sku;
    double price;
    int weight;
    boolean valid;

    public Product(String name, String sku, double price, int weight) {
        this.name = name;
        this.sku = sku;
        this.price = price;
        this.weight = weight;
    }

    boolean checkValidity() {
        boolean valid = true;
        if (this.name == null || this.name.length() == 0) {
            System.out.println("name is invalid");
            valid = false;
        }
        if (this.sku == null || this.sku.length() == 0) {
            System.out.println("sku is invalid");
            valid = false;
        }
        if (this.price < 0) {
            System.out.println("price is invalid");
            valid = false;
        }
        if (this.weight < 0) {
            System.out.println("weight is invalid");
            valid = false;
        }
        this.valid = valid;
        return valid;
    }

    void printInfo() {
        System.out.print(this.name + ", ");
        System.out.print(this.sku + ", ");
        System.out.print(this.price + ", ");
        System.out.print(this.weight);
        if (this.valid == false) {
            System.out.print(", Invalid");
        }
        System.out.println();
    }

}

public class ProductStore {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        /* Your Code */
        Product[] products = new Product[N];

        for (int i = 0; i < N; ++i) {
            scan.nextLine(); // throw away new-line char
            String name = scan.nextLine();
            String sku = scan.nextLine();
            double prices = scan.nextDouble();
            int weight = scan.nextInt();
            /* Your Code */
            products[i] = new Product(name, sku, prices, weight);
        }

        // Call checkVaidity of each product object.
        for (int i = 0; i < N; ++i) {
            /* Your Code */
            boolean valid = products[i].checkValidity();

            System.out.println(valid);
        }

        // Call printInfo of each product object.
        for (int i = 0; i < N; ++i) {
            /* Your Code */
            products[i].printInfo();
        }

    }
}
