package leaningjava.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas2Then4() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 10, 3, 8, 2};
        int value = 2;
        int result = find.indexOf(input, value);
        int expect = 4;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas14Then3() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 10, 3, 14, 78, 1, 63};
        int value = 14;
        int result = find.indexOf(input, value);
        int expect = 3;
        assertThat(result, is(expect));
    }
    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }
    @Test
    public void whenFind1() {
        int[] input = new int[] {5, 2, 10, 2, 4, 8, 9, 7};
        int value = 4;
        int start = 0;
        int finish = 3;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }

}
