package leaningjava.tracker;

public class FindById extends BaseAction {

    protected FindById(String name) {
        super(name);
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        tracker.findById(id);
        return true;
    }
}
