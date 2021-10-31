import org.junit.Test;
import org.mockito.Mockito;


import java.io.File;

import static org.junit.Assert.assertEquals;

public class InvalidValueTest {
    Main m = new Main();
    @Test
    public void valueTest() {
        final File mockedFile = Mockito.mock(File.class);
        assertEquals("Incorrect value",m.fizzbuzz(""));
        assertEquals("Incorrect value",m.fizzbuzz("a"));
        assertEquals("Incorrect value",m.fizzbuzz("64 45"));
        assertEquals("Incorrect value",m.fizzbuzz("6.4"));
        assertEquals("Incorrect value",m.fizzbuzz("0.5f"));
        assertEquals("Incorrect value",m.fizzbuzz("Any text"));
        assertEquals("Incorrect value",m.fizzbuzz(mockedFile.getPath()));
        assertEquals("Incorrect value",m.fizzbuzz("\n"));
        assertEquals("Incorrect value",m.fizzbuzz(null));
        assertEquals("Incorrect value",m.fizzbuzz("6.0"));

    }
}
