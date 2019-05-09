package guava;

import java.util.HashSet;
import java.util.Set;

public class Main {

  private static GuavaGenericImplementation guavaGenericImplementation = new GuavaGenericImplementation();

  public static void main(String[] args) {
    Set<Integer> set1 = new HashSet<>();
    set1.add(10);
    set1.add(20);
    set1.add(30);
    set1.add(40);

    Set<Integer> set2 = new HashSet<>();
    set2.add(20);
    set2.add(40);
    set2.add(60);

    System.out.println(guavaGenericImplementation.intersection(set1, set2));
    System.out.println(guavaGenericImplementation.symmetricDifference(set1, set2));
    System.out.println(guavaGenericImplementation.union(set1, set2));
    System.out.println(guavaGenericImplementation.sum(set1,set2));
  }
}
