package leaningjava.tracker;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenExit() {
        StubInput input = new StubInput(
                new String[] {"0"}
        );
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), new ArrayList<>());
        assertThat(action.isCall(), is(true));
    }

}

