package ClassWork.ClassWork15;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {
    @Test
    public void testSumm(){
        int res = Calc.sum(1,2);
        assertEquals(3, res);
    }

}