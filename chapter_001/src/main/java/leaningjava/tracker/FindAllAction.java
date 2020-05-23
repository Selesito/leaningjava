package leaningjava.tracker;

import java.util.ArrayList;

public class FindAllAction extends BaseAction {

    protected FindAllAction(String name) {
        super(name);
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        ArrayList<Item> items = tracker.findAll();
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }
        return true;
    }
}
