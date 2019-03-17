package Guava;

import java.util.Collection;

public abstract class GuavaGeneric<T extends Collection<Type>, Type> {

  abstract T sum(T t1, T t2);
  abstract T intersection(T t1, T t2);
  abstract T union(T t1, T t2);
  abstract T symmetricDifference(T t1, T t2);
}
