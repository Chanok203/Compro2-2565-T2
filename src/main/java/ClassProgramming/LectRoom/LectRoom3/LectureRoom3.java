package ClassProgramming.LectRoom.LectRoom3;

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

public class LectureRoom3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        LectRoom[] lectRooms = new LectRoom[K]; // 0 ... (K-1)
        for (int k = 0; k < K; ++k) {
            int classCode = sc.nextInt();
            String name = sc.next();
            int capacity = sc.nextInt();
            // สร้างวัตถุ LectRoom และเก็บไว้ที่อาเรย์
            lectRooms[k] = new LectRoom(classCode, name, capacity);
        }
        for (int i = 0; i < 3; ++i) {
            int n = sc.nextInt(); // 1 ... K
            LectRoom lr = lectRooms[n-1]; // เลือกวัตถุ จากค่า n
            System.out.println(lr.classCode + " " + lr.name + " " + lr.capacity);
        }
    }
}
