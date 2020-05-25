package leaningjava.tracker;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ItemSortedTest {
    @Test
    public void whenSortNameIncrease() {
        List<Item> items = Arrays.asList(
                new Item("Impl task"),
                new Item("Fix bugs"),
                new Item("Reboot server")
        );
        Collections.sort(items, new SortedByName());

        assertThat(items.toString(), is("[Fix bugs, Impl task, Reboot server]"));
    }

    @Test
    public void whenSortNameDecrease() {
        List<Item> items = Arrays.asList(
                new Item("Impl task"),
                new Item("Fix bugs"),
                new Item("Reboot server")
        );
        Collections.sort(items, new SortedByName());
        Collections.reverse(items);
        assertThat(items.toString(), is("[Reboot server, Impl task, Fix bugs]"));
    }
}
