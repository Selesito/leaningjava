package leaningjava.tracker;

public class FindById implements UserAction {
    @Override
    public String name() {
        return "=== Create a Find item by Id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        tracker.findById(id);
        return true;
    }
}
