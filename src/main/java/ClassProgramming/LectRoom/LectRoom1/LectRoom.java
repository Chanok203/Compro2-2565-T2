package ClassProgramming.LectRoom.LectRoom1;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class LectRoom {

    int classCode;
    String name;
    int capacity;
    int currentSeats = 0;

    public LectRoom(int classCode, String name, int capacity) {
        this.classCode = classCode;
        this.name = name;
        this.capacity = capacity;
    }

}
