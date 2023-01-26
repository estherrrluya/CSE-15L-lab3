import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlace1() {
    int[] input1 = {1, 2, 3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{3, 2, 1}, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed1() {
    int[] input1 = {1, 2, 3};
    int[] input2 = {2, 4, 6, 3, 4};
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{4, 3, 6, 4, 2}, ArrayExamples.reversed(input2));
  }

  @Test
  public void averageWithoutLowest() {
    double[] input1 = {1.3, 4, 5, 7};
    assertEquals((4.0 + 5.0 + 7.0) / 3.0,
    ArrayExamples.averageWithoutLowest(input1), 0.00001);
  }

  @Test
  public void averageWithoutLowest1() {
    double[] input1 = {1.0};
    assertEquals(0, 
    ArrayExamples.averageWithoutLowest(input1), 0.00001);
  }
}
