import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class polymorphismDemo{

    public static void manageAnimals(List<String> animals) {
        //animal list
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Elephant");
        animals.add("Giraffe");
        animals.add("Zebra");

        System.out.println("\nList Type: "
                + animals.getClass().getSimpleName());

        System.out.println("Animals in Zoo:");

        for (String animal : animals) {
            System.out.println(animal);
        }

        System.out.println("Total Animals: "
                + animals.size());

        System.out.println("Contains Tiger? "
                + animals.contains("Tiger"));
    }

    public static void main(String[] args) {

        List<String> arrayListAnimals = new ArrayList<>();
        List<String> linkedListAnimals = new LinkedList<>();

        manageAnimals(arrayListAnimals);
        manageAnimals(linkedListAnimals);
    }
}
