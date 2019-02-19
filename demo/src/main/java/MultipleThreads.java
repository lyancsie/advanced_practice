import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class MultipleThreads implements Runnable {

  Thread thread1 = new Thread();
  Thread thread2 = new Thread();
  List<String> myCustomList = Arrays.asList("a", "b", "c", "d", "e", "f", "g");

  @Override
  public void run() {
    for (int i = 0; i < myCustomList.size(); i++) {
      try {
        System.out.println(myCustomList.get(i));
        Thread.sleep(50);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public void start() {
    if (thread1 == null) {
      thread1 = new Thread(this);
      thread1.start();
    }
  }
}
