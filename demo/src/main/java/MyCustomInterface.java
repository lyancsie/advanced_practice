import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
public interface MyCustomInterface<T, U, V, R>{

  R doSomething(T t, U u, V v);
}