package Works.ClassWork.ClassWork16;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {
    @Test
    public void estSumm(){
        int res = Calc.sum(1,2);
        assertEquals(3, res);
    }

}