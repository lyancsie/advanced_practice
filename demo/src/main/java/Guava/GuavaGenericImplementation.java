package Guava;

import com.google.common.collect.Sets;
import java.util.Set;

public class GuavaGenericImplementation extends GuavaGeneric<Set<Integer>, Integer> {

  @Override
  Set<Integer> sum(Set<Integer> t1, Set<Integer> t2) {
    return null;
  }

  @Override
  Set<Integer> intersection(Set<Integer> t1, Set<Integer> t2) {
    return Sets.intersection(t1, t2);
  }

  @Override
  Set<Integer> union(Set<Integer> t1, Set<Integer> t2) {
    return Sets.union(t1, t2);
  }

  @Override
  Set<Integer> symmetricDifference(Set<Integer> t1, Set<Integer> t2) {
    return Sets.symmetricDifference(t1, t2);
  }
}
