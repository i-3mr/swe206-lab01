import java.util.*;

public class StudentRandomizer {
  public List<String> randomizeStudent() {
    int randomLength = (int) (Math.random() * 30);
    List<String> randomStudents = new ArrayList<>();
    for (int i = 0; i < randomLength; i++) {
      randomStudents.add("Student " + i);
    }

    return randomStudents;
  }
}
