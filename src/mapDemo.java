import java.util.HashMap;
import java.util.Map;

public class mapDemo {
    public static void main(String agrgs[]){
        Map<Integer,String> m1 = new HashMap<>();

        m1.put(101,"Purva");
        m1.put(102,"riya");
        m1.put(103,"raghav");
        m1.put(104,"ram");
        m1.put(101,"Purva");
        System.out.println(m1);

    }
}
