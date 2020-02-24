package leaningjava.tracker;

public class ReplaceItem implements UserAction {
    @Override
    public String name() {
        return "=== Create a Edit item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        item.setId(id);
        return true;
    }
}
