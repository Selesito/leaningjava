package leaningjava.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindByNameActionTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream stdout = System.out;

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

    @Test
    public void whenCheckOutputTwo() {
        Tracker tracker = new Tracker();
        Item item = new Item("fix");
        tracker.add(item);
        Item item2 = new Item("one");
        tracker.add(item2);
        Item item3 = new Item("fix");
        tracker.add(item3);
        Item item4 = new Item("fix");
        tracker.add(item4);
        FindByName act = new FindByName("fix");
        act.execute(new StubInput(new String[] {"fix"}), tracker);

        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add(item.getName())
                .add(item.getName())
                .add(item.getName())
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));

    }
}
