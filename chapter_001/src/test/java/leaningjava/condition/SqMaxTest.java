package leaningjava.condition;


import learningjava.condition.SqMax;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SqMaxTest {
    @Test
    public void whenp4k1s1() {
        int expected = 6;
        int s = SqMax.max(1, 6, 1, 5);
        assertThat(s, is(expected));
    }

    @Test
    public void whenp6k2s2() {
        int expected = 8;
        int s = SqMax.max(6, 7, 5, 8);
        assertThat(s, is(expected));
    }
    @Test
    public void whenp6k2s22() {
        int expected = 6;
        int s = SqMax.max(5, 4, 6, 1);
        assertThat(s, is(expected));
    }
    @Test
    public void whenp6k2s222() {
        int expected = 9;
        int s = SqMax.max(1, 9, 8, 1);
        assertThat(s, is(expected));
    }
    @Test
    public void whenp6k2s2222() {
        int expected = 6;
        int s = SqMax.max(6, 6, 6, 1);
        assertThat(s, is(expected));
    }
}
