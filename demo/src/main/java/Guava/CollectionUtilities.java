package Guava;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import javafx.collections.FXCollections;
import javafx.collections.transformation.SortedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    //TODO: System.out.println(concat.iterator()); --> what is an Iterable exactly

    //Integer oneElementThrowsException = Iterables.getOnlyElement(concat, 0);
    //breaks, because it's not a Singleton

    ImmutableList<Integer> immutableList = ImmutableList.of(1, 2, 3, 4, 6);
    System.out.println(immutableList.subList(0, 3));
    //immutableList.asList().add(1); --> throws UnsupportedOperationException
    //ImmutableList list2 = ImmutableList.toImmutableList(list); marked as unstable

    SortedList<Integer> sortedList = new SortedList<>(FXCollections.observableArrayList(Arrays.asList(11, 31, 0, 2)));
    System.out.println(sortedList);
    System.out.println(sortedList.sorted());
    //the list itself remains the same, so sortedList.sorted() is redundant in itself

    /* Other useful utilities:
     - Maps.difference(Map, Map)
     - MultiSets
     - Multimaps
     - More stuff from Iterables
     - Sets --> union, intersection, difference, symmetricDifference
     */
  }
}

