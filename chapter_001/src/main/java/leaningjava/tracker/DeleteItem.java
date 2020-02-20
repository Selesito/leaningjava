package leaningjava.tracker;

public class DeleteItem implements UserAction {
    @Override
    public String name() {
        return "=== Create a Delete item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        tracker.delete(id);
        return true;
    }
}
