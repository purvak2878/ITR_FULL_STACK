import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        // Storage
        students.put(101, "Purva");
        students.put(102, "Riya");
        students.put(103, "Sneha");

        // Retrieval
        System.out.println("Student with Roll No 102: "+ students.get(102));

        // Traversal
        System.out.println("\nStudent Records:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " : " +
                    entry.getValue());
        }
    }
}
