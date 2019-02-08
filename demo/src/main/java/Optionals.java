import com.example.demo.Kingdom;

import java.util.*;

public class Optionals {

  public static void main(String[] args) throws Exception {
    Kingdom emptyKingdom = new Kingdom();
    Kingdom someKingdom = new Kingdom(1, "Cool kingdom", 20);

    Integer kingdomId = Optional.ofNullable(emptyKingdom.getId()).orElse(0);
    String kingdomName = Optional.ofNullable(emptyKingdom.getName()).orElse("anonymous");

    System.out.println(kingdomId + " " + kingdomName);

    Integer realKingdomId = Optional.ofNullable(someKingdom.getId()).orElse(0);
    String realKingdomNameUpperCase = Optional.ofNullable(someKingdom.getName()).orElse("anonymous").toUpperCase();

    System.out.println(realKingdomId + " " + realKingdomNameUpperCase);
    System.out.println(Optional.empty());
    //String throwException = Optional.ofNullable(emptyKingdom.getName()).orElseThrow(() -> new Exception("Error")); --> can't be rewritten to method ref
    //String throwExceptionMethodRef = Optional.ofNullable(emptyKingdom.getName()).orElseThrow(Exception::new); --> same as the next one
    //String throwException2 = Optional.ofNullable(emptyKingdom.getName()).orElseThrow(() -> new Exception()); --> can be rewritten to method ref
  }
}