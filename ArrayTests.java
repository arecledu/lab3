import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  private static final double DELTA = 0.0001;

  @Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testSmallArrayReverseInPlace() {
    int[] input = { 2, 3 };
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{ 3, 2 }, input);
  }

  @Test
  public void testSmallArrayReversed() {
    int[] input = { 4, 5 };
    assertArrayEquals(new int[]{ 5, 4 }, ArrayExamples.reversed(input));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input = { 1.0, 1.0 };
    assertEquals(1.0, ArrayExamples.averageWithoutLowest(input), DELTA); 
  }
}
