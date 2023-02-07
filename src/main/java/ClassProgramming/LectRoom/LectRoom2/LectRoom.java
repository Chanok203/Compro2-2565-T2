package ClassProgramming.LectRoom.LectRoom2;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class LectRoom {
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