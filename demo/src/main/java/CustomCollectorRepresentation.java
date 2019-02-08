import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class CustomCollectorRepresentation {

  static CustomCollector<List<Integer>> customCollector = new CustomCollector<>();
  static CustomCollector<List<String>> customCollector2 = new CustomCollector<>();

  public static void main(String[] args) {

    customCollector.setT(Arrays.asList(12, 544, 4, 10));

    System.out.println(
            customCollector
                    .getT()
                    .stream()
                    .reduce(0, (a1, a2) -> a1 > a2 ? a1 : a2)
    );

    System.out.println(
            customCollector
                    .getT()
                    .stream()
                    .reduce(Math::max)
    );

    System.out.println(
            customCollector
                    .getT()
                    .stream()
                    .reduce(0, (a1, a2) -> a1 + a2));

    System.out.println(
            customCollector
                    .getT()
                    .stream()
                    .filter(i -> i < 20)
                    .reduce((a1, a2) -> a1 * a2).orElse(1)
    );

    System.out.println(
            customCollector
                    .getT()
                    .stream()
                    .max(Comparator.naturalOrder())
                    .orElseThrow(RuntimeException::new)
    );

    System.out.println(
            customCollector
                    .getT()
                    .stream()
                    .min(Comparator.naturalOrder())
                    .orElseThrow(RuntimeException::new)
    );
  }
}
