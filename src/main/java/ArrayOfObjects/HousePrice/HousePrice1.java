package ArrayOfObjects.HousePrice;

import java.util.Scanner;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
class House {
    
    int landSize;
    int quality;
    int floors;
    int houseArea;
    public int price;

    public House(int landSize, int quality, int floors, int houseArea) {
        this.landSize = landSize;
        this.quality = quality;
        this.floors = floors;
        this.houseArea = houseArea;
        this.price = this.computePrice(landSize, quality, floors, houseArea);
    }
    

    int computePrice(int landSize, int quality, int floors, int houseArea) {
        int price = 10_000 * landSize;
        price += (floors - 1) * 200_000;
        
        if (quality == 1) {
            price += 10_000 * houseArea;
        } else if (quality == 2) {
            price += 8_000 * houseArea;
        } else {
            price += 5_000 * houseArea;
        }
        
        return price;
    }
    
}

public class HousePrice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int landSize = sc.nextInt();
        int quality = sc.nextInt();
        int floors = sc.nextInt();
        int houseArea = sc.nextInt();
        House house = new House(landSize, quality, floors, houseArea);
        System.out.println(house.landSize + " " + house.quality + " " + house.floors + " " + house.houseArea);
        System.out.println(house.price);
    }
}
