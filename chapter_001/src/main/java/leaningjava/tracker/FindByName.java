package leaningjava.tracker;

import java.util.ArrayList;

public class FindByName extends BaseAction {

    protected FindByName(String name) {
        super(name);
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String key = input.askStr("Enter key: ");
        ArrayList<Item> items = tracker.findByName(key);
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }
        return true;
    }
}
