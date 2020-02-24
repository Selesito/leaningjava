package leaningjava.tracker;

public class FindByName extends BaseAction {

    protected FindByName(String name) {
        super(name);
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String key = input.askStr("Enter key: ");
        Item[] items = tracker.findByName(key);
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
        return true;
    }
}
