package learningjava.condition;

import learningjava.calculator.Fit;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;

public class PointTest {
    @Test
    public void distance() {

        double expected = 5.0;
        double out = Point.distance(0, 0, 3, 4);
        Assert.assertEquals(expected, out, 0.01);
    }


}
