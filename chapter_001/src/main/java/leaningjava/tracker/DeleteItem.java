package leaningjava.tracker;

public class DeleteItem extends BaseAction {

    protected DeleteItem(String name) {
        super(name);
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        tracker.delete(id);
        return true;
    }
}
