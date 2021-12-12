package Covid19Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ATest {

    @Test
    void testPlus() {
        A a = new A();
        assertEquals(12, a.plus(10, 1));
    }

}