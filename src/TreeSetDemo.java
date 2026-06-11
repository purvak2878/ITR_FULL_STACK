import java.util.TreeSet;
public class TreeSetDemo {
    public static void main(String args[]){
        TreeSet<String> surnames = new TreeSet<>();
        surnames.add("Kulkarni");
        surnames.add("Jadhav");
        surnames.add("Patil");
        surnames.add("Sharma");
        surnames.add("Kulkarni");//Duplicate element is ignored by all set interfaces
        surnames.add("Shinde");

        System.out.println(surnames);
        //follows the ascending order.

    }
}
