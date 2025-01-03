package Works.HomeWork.HomeWork16;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScitatelNePolzTest {

    @Test
    public void test1() {
        String input = "";
        assertEquals(0, count(input));
    }

    @Test
    public void test2() {
        String input = "sdfsdf 123 sdfkokj 456";
        assertEquals(2, count(input));
    }

    @Test
    public void test3() {
        String input = "sdfghsgfhj, sdfkokj. sdflkj";
        assertEquals(3, count(input));
    }


    @Test
    public void test4() {
        String input = "123@! sdfkokj, sdflkj. ljdsgklj sdkjfhskj fdd";
        assertEquals(5, count(input));
    }

    @Test
    public void test5() {
        String input = "a ab abc abcd";
        assertEquals(2, count(input));
    }

    @Test
    public void test6() {
        String input = "sdfhgdfsgd    sdfkokj     sdflkj ljdsgklj";
        assertEquals(4, count(input));
    }
}
