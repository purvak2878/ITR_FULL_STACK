import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String args[]){
        LinkedHashSet<Integer> pinCodes= new LinkedHashSet<>();
           pinCodes.add(431603);
           pinCodes.add(431703);
           pinCodes.add(431602);
           pinCodes.add(431603);//Duplicate element is ignored
        System.out.println(pinCodes);
        //LinkedHashSet follows an insertion order.
    }
}
