package class29HW;

import java.util.HashMap;

public class task2 {
    public static void main(String[] args) {
          /*
        Create a Set collection that will hold Objects of Student Type.
In this set we do not care about the insertion order. Each student object should
have name and studentID. Display name of each student.
         */
        HashMap<String,Integer> students= new HashMap();
        students.put("Maria",569);
        students.put("Beatrice",477);
        students.put("Laura",555);
        students.put("Max",327);
        students.put("Hugo",180);

        System.out.println(students.keySet());
    }
}
