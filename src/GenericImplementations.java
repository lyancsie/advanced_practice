import java.net.Inet4Address;
import java.util.*;

public class GenericImplementations {

  public static void main(String[] args) {
    CustomCollector<Integer> customCollector = new CustomCollector();
    customCollector.setT(3);
    System.out.println(customCollector.getT());

    CustomCollector<List<Integer>> customCollector2 = new CustomCollector<>();
    customCollector2.setT(Arrays.asList(1, 3, 4));
    System.out.println(customCollector2.getT());

    CustomCollector<String> customCollector3 = new CustomCollector();
    customCollector3.setT("This is a custom string");
    System.out.println(customCollector3.getT());

    CustomCollector<HashMap<Integer, Kingdom>> customCollector4 = new CustomCollector();
    HashMap<Integer, Kingdom> hashMap = new HashMap<>();
    hashMap.put(1, new Kingdom(1, "x", 3));
    hashMap.put(2, new Kingdom(2, "y", 4));
    customCollector4.setT(hashMap);
    System.out.println(customCollector4.getT().getClass());
    System.out.println(customCollector4.getT()); //why i can't call the HashMap methods here?

    CustomCollector<HashMap<Integer, List<Kingdom>>> customCollector5 = new CustomCollector();
    HashMap<Integer, List<Kingdom>> hashMap2 = new HashMap<>();
    Kingdom kingdom1 = new Kingdom(3, "x", 15);
    Kingdom kingdom2 = new Kingdom(4, "Kiraly vagyok", 100);
    hashMap2.put(1,Arrays.asList(kingdom1, kingdom2));
    customCollector5.setT(hashMap2);
    System.out.println(customCollector5.getT());

    //if you write the requirements to the left side, the requirements are going to be much more stronger
    //regarding the class
  }
}