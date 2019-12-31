package leaningjava.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {
    @Test
    public void when5() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(5);
        assertThat(rsl, is(true));
    }

    @Test
    public void when4() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(6);
        assertThat(rsl, is(false));
    }
    @Test
    public void when6() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(6);
        assertThat(rsl, is(false));
    }
    @Test
    public void when7() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(7);
        assertThat(rsl, is(true));
    }
    @Test
    public void when10() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(10);
        assertThat(rsl, is(false));
    }
    @Test
    public void when13() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(13);
        assertThat(rsl, is(true));
    }
    @Test
    public void when3() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(3);
        assertThat(rsl, is(true));
    }
}
