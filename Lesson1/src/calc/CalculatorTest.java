package calc;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class CalculatorTest {

  @Test
  public void testSum() {
    Calculator calc = new Calculator();
    int sum = calc.sumInts(3, 5);
    //assertEquals("Calculator test failed!", 8, sum);
    assertThat(sum, is(8));
  }
}
