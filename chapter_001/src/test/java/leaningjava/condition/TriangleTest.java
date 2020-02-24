package leaningjava.condition;

import org.junit.Test;
import ru.job4j.condition.Point;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        Point first = new Point(1, 1, 1);
        Point second = new Point(2, 3, 5);
        Point third = new Point(6, 7, 8);
        Triangle triangle = new Triangle(first, second, third);
        assertThat(triangle.area(), is(8.440971508067072));
    }


}

