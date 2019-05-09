package customcollector;

import com.example.demo.Building;
import com.example.demo.Kingdom;
import com.example.demo.Resource;

import java.util.*;
import java.util.function.Supplier;

public class GenericImplementations {

  public static void main(String[] args) {
    CustomCollector<Integer, Supplier> customCollector = new CustomCollector<Integer,Supplier>();
    customCollector.setT(3);
    System.out.println(customCollector.getT());

    CustomCollector customCollector2 = new CustomCollector<List<Integer>, List<String>>();

    Collection<Long> x = new ArrayList<>();
    customCollector2.setT(Arrays.asList(1, 3, 4));
    System.out.println(customCollector2.getT());
    //raw type

    CustomCollector<Double,Integer> customCollector3 = new CustomCollector<Double,Integer>();
    customCollector3.setT(5.0);
    System.out.println(customCollector3.getT());
    //raw type

    CustomCollector<Map<Integer, Kingdom>, Map<Kingdom, Kingdom>> customCollector4 =
            new CustomCollector<Map<Integer,Kingdom>,Map<Kingdom, Kingdom>>();

    CustomCollector<Map<Kingdom, Building>,Map<Kingdom, Resource>> customCollectorRepresentation =
            new CustomCollector<Map<Kingdom, Building>,Map<Kingdom, Resource>>();


    Map<Integer, Kingdom> hashMap = new HashMap<>();
    hashMap.put(1, new Kingdom(1, "x", 3));
    hashMap.put(2, new Kingdom(2, "y", 4));
    customCollector4.setT(hashMap);
    System.out.println(customCollector4.getT().getClass());
    System.out.println(customCollector4.getT());

    CustomCollector<Map<Integer, List<Kingdom>>, Integer> customCollector5 = new CustomCollector<Map<Integer, List<Kingdom>>,Integer>();
    Map<Integer, List<Kingdom>> hashMap2 = new HashMap<>();
    Kingdom kingdom1 = new Kingdom(3, "x", 15);
    Kingdom kingdom2 = new Kingdom(4, "Álmos vagyok", 100);
    hashMap2.put(1, Arrays.asList(kingdom1, kingdom2));
    customCollector5.setT(hashMap2);
    System.out.println(customCollector5.getT());
  }
}