package leaningjava.condition;


import learningjava.condition.SqMax;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SqMaxTest {
    @Test
    public void whenp4k1s1() {
        int expected = 5;
        int s = SqMax.max(1, 5, 3, 4);
        assertThat(s, is(expected));
    }

    @Test
    public void whenp6k2s2() {
        int expected = 6;
        int s = SqMax.max(6, 2, 5, 4);
        assertThat(s, is(expected));
    }
}
