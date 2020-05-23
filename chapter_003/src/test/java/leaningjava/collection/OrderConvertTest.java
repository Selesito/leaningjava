package leaningjava.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class OrderConvertTest {
    @Test
    public void whenSingleOrder() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("3sfe", "Dress"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.get("3sfe"), is(new Order("3sfe", "Dress")));
    }
    @Test
    public void whenOrder() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("2gr-fe", "Dress"));
        orders.add(new Order("3gr-fe", "Crown"));
        orders.add(new Order("4gr-fe", "Dress"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.get("3gr-fe"), is(new Order("3gr-fe", "Crown")));
    }
}