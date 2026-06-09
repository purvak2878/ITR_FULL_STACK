import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();
        //animal list
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Elephant");
        animals.add("Monkey");
        animals.add("Zebra");

        System.out.println("Initial Animal List:");
        System.out.println(animals);

        animals.add(2, "Giraffe");
        animals.set(3, "Panda");
        animals.remove("Monkey");

        System.out.println("\nContains Tiger? " +
                animals.contains("Tiger"));

        System.out.println("Animal at index 1: " +
                animals.get(1));

        System.out.println("Total Animals: " +
                animals.size());

        System.out.println("\nFinal Animal List:");

        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
