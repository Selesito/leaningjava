package leaningjava.tracker;

import java.util.ArrayList;

public class StartUI {

    public void init(Input input, Tracker tracker, ArrayList<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.size());
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(ArrayList<UserAction> actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.size(); index++) {
            System.out.println(index + ". " + actions.get(index).name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        ArrayList<UserAction> actions = new ArrayList<>();
                actions.add(new CreateAction("=== Create a new Item ===="));
                actions.add(new ReplaceItem("=== Create a Edit item ===="));
                actions.add(new DeleteItem("=== Create a Delete item ===="));
                actions.add(new FindAllAction("=== Create a Show all items ===="));
                actions.add(new FindById("=== Create a Find item by Id ===="));
                actions.add(new FindByName("=== Create a Find items by name ===="));

        new StartUI().init(validate, tracker, actions);
    }
}

