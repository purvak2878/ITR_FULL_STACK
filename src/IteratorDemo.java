import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class User {
    int id;
    String name;

    User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

public class IteratorDemo {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();

        // Storing data
        users.add(new User(101, "Purva"));
        users.add(new User(102, "Rahul"));
        users.add(new User(103, "Sneha"));

        System.out.println("Using Iterator:");

        Iterator<User> itr = users.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("\nUsing ListIterator (Forward):");

        ListIterator<User> litr = users.listIterator();
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }

        System.out.println("\nUsing ListIterator (Backward):");

        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
    }
}
