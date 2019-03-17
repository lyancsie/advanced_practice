package Guava;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import javafx.collections.FXCollections;
import javafx.collections.transformation.SortedList;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.*;
import java.util.function.Function;

public class CollectionUtilities {

  public static void main(String[] args) {

    List<Integer> filteredList = new ArrayList<>();
    filteredList.add(73);
    Integer oneElementPasses = Iterables.getOnlyElement(filteredList);
    System.out.println(oneElementPasses);

    Iterable<Integer> concat = Iterables.concat(
            Arrays.asList(1, 3, 4),
            Arrays.asList(50, 2, 5)
    );

    //TODO: Iterables.transform()

    Function<String, @Nullable Integer> function = String::length;

    System.out.println(function.apply("abcs"));

    List<String> names = Lists.newArrayList("abab", "baba", "Lyanosh");

    Iterable<Integer> result = Iterables.transform(names, function::apply);
    System.out.println("This is what i need: ");
    result.forEach(System.out::println);
    //TODO: System.out.println(concat.iterator()); --> what is an Iterable exactly
    Iterator<Integer> i = concat.iterator();
    while (i.hasNext()) {
      System.out.print(i.next() + " ");
    }

    //Integer oneElementThrowsException = Iterables.getOnlyElement(concat, 0);
    //breaks, because it's not a Singleton

    ImmutableList<Integer> immutableList = ImmutableList.of(1, 2, 3, 4, 6);
    System.out.println(immutableList.subList(0, 3));
    //immutableList.asList().add(1); --> throws UnsupportedOperationException
    //ImmutableList list2 = ImmutableList.toImmutableList(list); marked as unstable

    SortedList<Integer> sortedList = new SortedList<>(FXCollections.observableArrayList(Arrays.asList(11, 31, 0, 2)));
    System.out.println("SortedList: " + sortedList);
    System.out.println("SortedList.sorted();" + sortedList.sorted());
    //the list itself remains the same, so sortedList.sorted() is redundant in itself

    /* Other useful utilities:
     - Maps.difference(Map, Map)
     - MultiSets
     - Multimaps
     - More stuff from Iterables
     - Sets --> union, intersection, difference, symmetricDifference
     */

    Map<String, Integer> map1 = new HashMap<>();
    Map<String, Integer> map2 = new HashMap<>();

    map1.put("Istvan", 2);
    map1.put("Geza", 1);
    map1.put("Ferenc", 10);

    map2.put("Istvan", 2);
    map2.put("Geza", 1);
    map2.put("Ferenc", 10);
    map2.put("X", 10);

    System.out.println(Maps.difference(map1, map2));

    
  }
}