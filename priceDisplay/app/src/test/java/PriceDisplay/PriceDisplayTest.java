package PriceDisplay;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PriceDisplayTest {
    @Test public void dusplayPrice() {
    PriceDisplay tosterPrice = new PriceDisplay();
    assertEquals("Should tell you the name and price", String.format("The price of the %s is: %f", "Katie", 15.99), tosterPrice.show("Katie", 15.99) );
    }
}
