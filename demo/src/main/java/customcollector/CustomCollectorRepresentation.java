package customcollector;

import lombok.SneakyThrows;

import java.util.*;

public class CustomCollectorRepresentation {

  private static CustomCollector<List<Integer>, Integer> customCollector = new CustomCollector<List<Integer>, Integer>();

  private static CustomCollector<List<String>, HashMap<Integer, String>> customCollector2 =
          new CustomCollector<List<String>, HashMap<Integer, String>>();

  public static void main(String[] args) {

    ArrayList<String> customStuff = new ArrayList<>();

    if (customStuff instanceof ArrayList) {
      System.out.println(7);
    }

    customCollector.setT(Arrays.asList(12, 544, 4, 10));
    customCollector2.setT(Arrays.asList("a", "b", "c", "R", "Z", "A"));

    System.out.println(
            customCollector
                    .getT()
                    .stream()
                    .reduce((a1, a2) -> a1 > a2 ? a1 : a2) //if I don't set identity, I can make it optional!
    );

    System.out.println(
            customCollector.getT()
                    .stream()
                    .reduce((a1, a2) -> a1 < a2 ? a1 : a2)
                    .orElseThrow(RuntimeException::new) //or a1 > a2 ? a2 : a1 );
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
                    .reduce((a1, a2) -> a1 * a2).orElse(1) //Optional, because no identity set in reduce
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

    System.out.println(
            customCollector2
                    .getT()
                    .stream()
                    .max(Comparator.naturalOrder())
                    .orElseThrow(RuntimeException::new)
    );

    System.out.println(
            customCollector2
                    .getT()
                    .stream()
                    .max(Comparator.comparing(i -> i))
                    .orElse("")
    );

    String basicValue = "abc";

    System.out.println(
            customCollector2.getT()
                    .stream()
                    .reduce((a1, a2) -> (a1 + a2))
                    .orElse(basicValue)
    );
  }
}
