import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionalInterfacesDemo {
    public static void main(String args[]){
        //Predicate
        Predicate<String> StartWithP= word ->word.charAt(0)=='p';
        System.out .println(StartWithP.test("purva"));
        System.out.println(StartWithP.test("java"));

        //Supplier
        Supplier<String> supplier = () -> "Java";
        System.out.println("Supplier:" + supplier.get());

        //Consumer
        Consumer<String> consumer = name -> System.out.println("consumer: Hello"+ name);
        consumer.accept("Purva");

        //Function
        Function<Integer,Integer> square = n -> n * n;
        System.out.println("Function: Square = " + square.apply(5));
    }
}
