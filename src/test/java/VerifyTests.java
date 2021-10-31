import org.junit.Test;
import org.mockito.Mockito;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class VerifyTests {
    Main m = new Main();
    @Test
    public void isTxtTest(){
        assertEquals(true, m.verify("./src/main/resources/example.txt"));
    }
    @Test
    public void isNotTxtTest(){
        final File mockedFile = Mockito.mock(File.class);
        assertEquals(false, m.verify(""));
        assertEquals(false, m.verify(".txt"));
        assertEquals(false, m.verify("./src/main"));
        assertEquals(false, m.verify("./src/main/java/Main.java"));
        assertEquals(false, m.verify(null));
        assertEquals(false, m.verify(mockedFile.getPath()));
        assertEquals(false, m.verify("\n"));
    }

}
