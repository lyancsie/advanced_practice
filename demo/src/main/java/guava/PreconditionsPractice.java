package guava;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PreconditionsPractice {

  public static void main(String[] args) {
    System.out.println(Preconditions.checkNotNull(Optional.of(5)));

    List<Integer> list = new ArrayList<>(Arrays.asList(145, 25, 3, 4));
    System.out.println(Preconditions.checkElementIndex(3, list.size()));

    System.out.println(Preconditions.checkPositionIndex(1, list.size()));

    Boolean b = false;

    Preconditions.checkState(b); //throws an exception, the following code doesn't run

    Integer i = 3;
    i += 1;
    System.out.println(i);
  }
}