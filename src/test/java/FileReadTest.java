
import org.junit.Test;
import org.mockito.Mockito;

import java.io.File;



import static org.junit.Assert.assertEquals;

public class FileReadTest {

    Main m = new Main();

    @Test
    public void nullPointerTest() {
        final File mockedFile = Mockito.mock(File.class);
        assertEquals("np error",m.fileread(mockedFile.getPath()));
        assertEquals("np error",m.fileread(null));
    }
    @Test
    public void noFileTest() {
        assertEquals("File not found",m.fileread(""));
    }
    @Test
    public  void okFileReadTest(){
        assertEquals("ok",m.fileread("./src/main/resources/example.txt"));
    }

}
