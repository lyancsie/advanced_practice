package bigO;

import java.util.ArrayList;
import java.util.List;

public class Loops {

  private static final Integer REPEAT = 5000000;
  private static List<Integer> list = new ArrayList<>();
  private static Long beginning;

  static void initialize() {
    beginning = System.currentTimeMillis();
  }

  static void sout() {
    System.out.println(System.currentTimeMillis() - beginning);
  }

  static void set() {
    list = new ArrayList<>();
    for (int i = 0; i < REPEAT; i++) {
      //the size dynamically changes, therefore a new List is created in every iteration.
      list.add(i);
    }
  }

  public static void main(String[] args) {

    initialize();
    set();
    sout();

    set();
    initialize();
    for (int i = 0; i < list.size(); i++) {
      list.set(i, list.get(i) + 1);
    }
    sout();

    set();
    initialize();
    int i = REPEAT;
    while (i > 0) {
      list.set(i - 1, list.get(i - 1) + 1);
      i--;
    }
    sout();

    set();
    initialize();
    list.forEach(a -> a += 1);
    sout();

    set();
    initialize();
    for (Integer a : list) {
      list.set(a, list.get(a) + 1);
    }
    sout();
  }
  //TODO: stream API test for multiple filters VS for loops

}


