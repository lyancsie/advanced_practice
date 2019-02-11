import java.util.Optional;
import java.util.Random;
import java.util.function.*;

public class FunctionalInterfaces {

  public static void main(String[] args) {

    Supplier<Integer> getInt = () -> 10;

    Optional<String> x = Optional.of("blabl") ;

    Random random = new Random();
    Integer n = random.nextInt(2) + 1;
    Integer randomValue = null;
    if (n.equals(2)) {
      randomValue = 5;
    }

    String value1 = Optional.ofNullable(randomValue).orElse(getInt.get()).toString();
    //value1 can be null, thus I have to use ofNullable
    System.out.println(value1);

    Integer integerWithLambda = Optional.ofNullable(randomValue).orElseGet(getInt);
    System.out.println(integerWithLambda);

    Integer optionalValue = Optional.ofNullable(randomValue).orElse(0);
    System.out.println(optionalValue);

    Consumer<?> consumer = c -> System.out.println(c); // OR System.out::println

    //Optional<Integer> x = Optional.of(100);
    //x.ifPresent((Consumer<? super Integer>) consumer.andThen(System.out::println));

    Consumer<? super Integer> consumer2 = c -> System.out.println(c); // OR System.out::println

    Optional<Integer> x2 = Optional.of(100);
    x2.ifPresent((Consumer<? super Integer>) consumer.andThen(System.out::println));

    //writes it twice
    if (x.isPresent()) {
      consumer.andThen(System.out::println);
    }

    x.ifPresent((a) -> System.out.println(a));
    //x.ifPresent(consumer2);

    //System.out.println(x.filter(i -> i > 3));

    Predicate<?> isValid = c -> (c != null) && (c.equals(5) || c.equals(5L) || c.equals(Integer.toString(5)));

    UnaryOperator<Integer> unaryOperator = c -> 2 * c;
    UnaryOperator<Integer> unaryOperator1 = c -> 3 * c;

    System.out.println(unaryOperator.compose(unaryOperator1).apply(10));

  }
}