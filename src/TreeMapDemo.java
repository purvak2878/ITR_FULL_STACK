import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap<Integer, String> patients =
                new TreeMap<>();

        // Storage
        patients.put(305, "Karan");
        patients.put(301, "Anjali");
        patients.put(304, "Rohit");

        // Retrieval
        System.out.println("Patient ID 301: "+ patients.get(301));

        // Traversal
        System.out.println("\nPatient Records:");
        for (Map.Entry<Integer, String> entry :
                patients.entrySet()) {

            System.out.println(entry.getKey() + " : " +
                    entry.getValue());
        }
    }
}