package leaningjava.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }


    @Test
    public void whenDeleteNameThenReturnBooleanResult() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1");
        Item second = new Item("test2");
        Item third = new Item("test3");
        Item fourth = new Item("test4");
        tracker.add(first);
        tracker.add(second);
        tracker.add(third);
        tracker.add(fourth);
        assertThat(tracker.delete(second.getId()), is(true));

    }

    @Test
    public void whenFindByNameThenReturnResult() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1");
        Item second = new Item("test2");
        Item third = new Item("test3");
        Item fourth = new Item("test2");
        tracker.add(first);
        tracker.add(second);
        tracker.add(third);
        tracker.add(fourth);
        int size = tracker.findByName("test2").size();
        assertThat(size, is(2));

    }

    @Test
    public void whenFindAllThenReturnResult() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1");
        Item second = new Item("test2");
        Item third = new Item("test3");
        Item fourth = new Item("test4");
        tracker.add(first);
        tracker.add(second);
        tracker.add(third);
        tracker.add(fourth);
        int size = tracker.findAll().size();
        assertThat(size, is(4));
    }



}
