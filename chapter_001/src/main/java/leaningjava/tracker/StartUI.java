package leaningjava.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.length);
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction("=== Create a new Item ===="),
                new ReplaceItem("=== Create a Edit item ===="),
                new DeleteItem("=== Create a Delete item ===="),
                new FindAllAction("=== Create a Show all items ===="),
                new FindById("=== Create a Find item by Id ===="),
                new FindByName("=== Create a Find items by name ====")
        };
        new StartUI().init(validate, tracker, actions);
    }
}

