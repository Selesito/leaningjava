package leaningjava.tracker;



public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println(item.getId());
    }

    public static void allItems(Input input, Tracker tracker) {
        System.out.println("=== Create a Show all items ====");
        Item[] items = tracker.findAll();
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Create a Edit item ====");
        String id = input.askStr("Enter id: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        System.out.println(tracker.replace(id, item));
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Create a Delete item ====");
        String id = input.askStr("Enter id: ");
        System.out.println(tracker.delete(id));
    }

    public static void findById(Input input, Tracker tracker) {
        System.out.println("=== Create a Find item by Id ====");
        String id = input.askStr("Enter id: ");
        System.out.println(tracker.findById(id));
    }

    public static void findByName(Input input, Tracker tracker) {
        System.out.println("=== Create a Find items by name ====");
        String key = input.askStr("Enter key: ");
        Item[] items = tracker.findByName(key);
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.allItems(input, tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findById(input, tracker);
            } else if (select == 5) {
                StartUI.findByName(input, tracker);
            } else if (select == 6) {
                System.out.println("Выход из программы!");
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");

    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
