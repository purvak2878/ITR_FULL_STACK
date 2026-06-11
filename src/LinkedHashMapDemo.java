import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> employees =
                new LinkedHashMap<>();

        // Storage
        employees.put(201, "Rahul");
        employees.put(202, "Neha");
        employees.put(203, "Aman");

        // Retrieval
        System.out.println("Employee ID 202: "+ employees.get(202));

        // Traversal
        System.out.println("\nEmployee Records:");
        for (Map.Entry<Integer, String> entry :
                employees.entrySet()) {

            System.out.println(entry.getKey() + " : " +
                    entry.getValue());
        }
    }
}