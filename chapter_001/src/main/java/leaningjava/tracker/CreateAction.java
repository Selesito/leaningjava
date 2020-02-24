package leaningjava.tracker;

public class CreateAction extends BaseAction {

    protected CreateAction(String name) {
        super(name);
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.print("Enter name: ");
        String name = input.askStr("");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println(item.getId());
        return true;
    }
}

