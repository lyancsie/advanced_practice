import lombok.Getter;
import lombok.Setter;

import java.util.function.Consumer;

@Getter
@Setter
public class Kingdom {
  
  private Integer id;
  private String name;
  private Integer level;
  
  public Kingdom() {
  }

  public Kingdom(Consumer<?> t){

  };
  
  public Kingdom(Integer id, String name, Integer level) {
    this.id = id;
    this.name = name;
    this.level = level;
  }
  
  public Integer getId() {
    return id;
  }
  
  public void setId(Integer id) {
    this.id = id;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public Integer getLevel() {
    return level;
  }
  
  public void setLevel(Integer level) {
    this.level = level;
  }
}
