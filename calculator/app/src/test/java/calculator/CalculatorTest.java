package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculatorTest {
  @Test public void testAddsTwoAndTwo() {
    calculator calc = new calculator();
    assertEquals("2 + 2 should equal 4", Integer.valueOf(4), calc.add(2, 2));
  }

  @Test public void testMinusesIntFromInt() {
    calculator calc = new calculator();
    assertEquals("3 - 1 should equal 2", Integer.valueOf(2), calc.minus(3,1));
  }
  
}
