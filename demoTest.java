import static org.junit.Assert.*;
import org.junit.*;

public class demoTest {
    @Test
    public void testPos(){
        assertEquals(true, demo.isPositive(-5));
    }
}
