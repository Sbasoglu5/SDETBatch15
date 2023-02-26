package class29Homework;

import java.util.HashMap;
import java.util.HashSet;

public class Task3 {/*Create a Set collection that will hold Objects of Student Type.
                    In this set we do not care about the insertion order.
                    Each student object should have name and studentID.
                    Display name of each student.*/

    public static void main(String[] args) {
        HashMap<String, Integer> students=new HashMap<>();
        students.put("Tom",19245);
        students.put("Katy",19256);
        students.put("Sabrina",19278);

        System.out.println(students);

    }
}
