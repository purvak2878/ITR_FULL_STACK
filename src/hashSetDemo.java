import java.util.HashSet;

public class hashSetDemo {
    public static void main(String args[]){
        HashSet<String> city =new HashSet<>();
        city.add("Mumbai");
        city.add("Pune");
        city.add("Nagpur");
        city.add("Mumbai");//hashSet ignores the Duplicate values
        city.add("Goregoan");
        System.out.println(city);
        //data doesn't follow any order
    }
}
