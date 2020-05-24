package leaningjava.tracker;

public class ReplaceItem extends BaseAction {

    protected ReplaceItem(String name) {
        super(name);
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
