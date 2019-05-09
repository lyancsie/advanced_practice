package customcollector;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomCollector<T, U> {

  private T t;
  private U u;
}