package generic;

import java.util.ArrayList;
import java.util.List;

public class Main<T> {
  T t;

private List<Addable<T>> addableList = new ArrayList<>();

  public void main(String[] args) {


    for (int i = 0; i < addableList.size(); i++) {
      addableList.get(i).add(t);
    }
  }
}
