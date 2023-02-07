package ClassProgramming.LectRoom.LectRoom4;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */

import java.util.Scanner;

// Task 2
class LectRoom {
    // class variables
    int classCode;
    String name;
    int capacity;
    int currentSeats = 0;
    
    // constructor
    public LectRoom(int classCode, String name, int capacity) {
        this.classCode = classCode;
        this.name = name;
        this.capacity = capacity;
    }
    
    // methods
    boolean reserveSeats(int seats) {
        if (this.currentSeats + seats > this.capacity) {
            return false;
        }
        this.currentSeats += seats;
        return true;
    }
     
}
// Task 3
public class LectureRoom4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        
        LectRoom[] lectRooms = new LectRoom[K]; // 0 ... (K-1)
        for (int k = 0; k < K; ++k) {
            int classCode = sc.nextInt();
            String name = sc.next();
            int capacity = sc.nextInt();
            
            lectRooms[k] = new LectRoom(classCode, name, capacity); // สร้างวัตถุ LectRoom และเก็บไว้ที่อาเรย์
        }
        
        // Task 4
        int N = sc.nextInt();
        for (int n = 0; n < N; ++n) {
            int classCode = sc.nextInt();
            int seats = sc.nextInt();
            boolean printed = false;
            for (int i = 0; i < lectRooms.length; ++i) {
                LectRoom lr = lectRooms[i];
                if (lr.classCode != classCode) {
                    continue;
                }
                boolean success = lr.reserveSeats(seats);
                if (success) {
                    System.out.println(lr.name);
                    printed = true;
                    break;
                }
            }
            if (!printed) {
                System.out.println("sorry");
            }
        }
    }
    
}
