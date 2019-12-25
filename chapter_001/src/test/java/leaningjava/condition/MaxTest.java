package leaningjava.condition;

import learningjava.condition.Max;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat (result, is(2));
    }
    @Test
    public void whenMax1ToThen2() {
        int result = Max.max(5, 2);
        assertThat (result, is(5));
    }
    @Test
    public void whenMax1To2Max2() {
        int result = Max.max(3, 3);
        assertThat (result, is(3));
    }
}
