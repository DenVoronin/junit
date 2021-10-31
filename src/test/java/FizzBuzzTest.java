
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    Main m = new Main();
    @Test
    public void fbtest(){
        assertEquals("Buzz", m.fizzbuzz("5"));
        assertEquals("Fizz", m.fizzbuzz("9"));
        assertEquals("FizzBuzz", m.fizzbuzz("60"));
        assertEquals("8", m.fizzbuzz("8"));
        assertEquals("Fizz",m.fizzbuzz("-3"));
        assertEquals("0", m.fizzbuzz("0"));
        assertEquals("-7", m.fizzbuzz("-7"));

    }


}
