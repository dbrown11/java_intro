/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package PriceDisplay;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test public void dusplayPrice() {
        App tosterPrice = new App();       
        assertEquals("Should tell you the name and price", String.format("The price of the %s is: %f", "Katie", 17.99), tosterPrice.showNew("Katie", 15.99, 2.00) );

    }
}
