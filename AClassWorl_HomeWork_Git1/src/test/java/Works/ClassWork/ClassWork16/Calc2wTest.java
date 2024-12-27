package Works.ClassWork.ClassWork16;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Calc2wTest {

    @Test
    public void testInit() {
        Calc2 c = new Calc2w();
        assertEquals(0f, c.getcurrentValue(), 0.000001);
    }

    @Test
    public void testAdd() {
        Calc2 c = new Calc2w();
        assertEquals(12f, c.add(12));
        assertEquals(12f, c.getcurrentValue());
        assertEquals(23f, c.add(11));
        assertEquals(23f, c.getcurrentValue());
        assertEquals(23.5f, c.add(23.5f));
    }

    @Test
    public void testDecrement() {
        Calc2 c = new Calc2w();
        assertEquals(0f, c.getcurrentValue());
    }
}
