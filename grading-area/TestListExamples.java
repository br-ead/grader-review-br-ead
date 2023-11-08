import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.List;

class IsMoon implements StringChecker {
  public boolean checkString(String s) {
    return s.equalsIgnoreCase("moon");
  }
}

public class TestListExamples {
  int points = 0;

  @Test(timeout = 500)
  public void testMergeRightEnd() {
    List<String> left = Arrays.asList("a", "b", "c");
    List<String> right = Arrays.asList("a", "d");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
    if (assertEquals(expected, merged)) {
      points += 1;
    }
  }

  @Test(timeout = 500)
  public void testFilter() {
    List<string> input = Arrays.asList("a", "b", "1", "c ");
    List<String> expected = Arrays.asList("a", "b", "c ");
    List<String> filter = ListExamples.filter(input);
    if (assertEquals(input, expected)) {
      points += 1;
    }

  }
}
