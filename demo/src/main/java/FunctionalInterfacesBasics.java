import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.function.*;

public class FunctionalInterfacesBasics {

  public static void main(String[] args) {

    Supplier<Integer> supplier = new Supplier<Integer>() {

      @Override
      public Integer get() {
        return 1;
      }
    };

    Consumer<String> consumer64644 = (a) -> System.out.println(a);


    Supplier<Integer> supplier1 = () -> 600;

    System.out.println(supplier.get());
    System.out.println(supplier1.get());

    Consumer<Integer> customConsumer = new Consumer<Integer>() {

      @Override
      public void accept(Integer integer) {
        System.out.println(integer);
      }
    };

    Consumer<String> consumer1 = (a) -> System.out.println(a + "bla");
    Consumer<String> consumer2 = (c) -> {
      for (int i = 0; i < 10; i++) {
        System.out.println(c);
      }
    };

    consumer2.andThen(consumer1).accept("ABAB");
    consumer1.andThen(consumer2).accept("abc");

    Predicate<List<Integer>> predicate = new Predicate<List<Integer>>() {

      @Override
      public boolean test(List<Integer> integers) {
        return !integers.isEmpty();
      }
    };

    String incorrectName = "ab";
    String correctName = "shite";

    Predicate<String> isEmptyOrNull = d -> d == null || d.isEmpty();
    Predicate<String> isValid = d -> d.equals("Narnia") || d.equals("Yolo") || d.equals("shite");
    System.out.println(isEmptyOrNull.or(isValid).test(incorrectName));
    System.out.println(isEmptyOrNull.or(isValid).test(correctName));

    Function<Integer, Integer> twoTimes = new Function<Integer, Integer>() {

      @Override
      public Integer apply(Integer integer) {
        return integer * 2;
      }
    };

    Function<Integer, Integer> square = c -> c * c;

    System.out.println(square.andThen(twoTimes).apply(5));
    System.out.println(square.compose(twoTimes).apply(5));

    IntToDoubleFunction intToDoubleFunction = c -> c;

    BiFunction<Integer, Integer, Boolean> biggerThan100 = (c, d) -> c * d > 100;
    System.out.println(biggerThan100.apply(23, 4));
    System.out.println(biggerThan100.apply(26, 5));

    BiFunction<Integer, Integer, Boolean> biggerThan120 = new BiFunction<Integer, Integer, Boolean>() {

      @Override
      public Boolean apply(Integer integer, Integer integer2) {
        return integer+integer2 > 120;
      }
    };


    MyCustomInterface<Integer, Integer, Integer, Integer> fsgsgsgt = new MyCustomInterface<Integer, Integer, Integer, Integer>() {

      @Override
      public Integer doSomething(Integer integer, Integer integer2, Integer integer3) {
        return integer+integer2+integer3;
      }
    };

    fsgsgsgt.doSomething(20,20,20);


    MyCustomInterface<Integer, Integer, Integer, Integer> somethingOriginal = (a, b, c) -> (a * b * c);


   Thread thread = new Thread(()-> System.out.println("This is a new thread"));
   thread.start();
  }
}