package leaningjava.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                System.out.println(item.getId());
            } else if (select == 1) {
                System.out.println("=== Create a Show all items ====");
                Item[] items = tracker.findAll();
                for (int i = 0; i < items.length; i++) {
                    System.out.println(items[i]);
                }
            } else if (select == 2) {
                System.out.println("=== Create a Edit item ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                System.out.println(tracker.replace(id, item));
            } else if (select == 3) {
                System.out.println("=== Create a Delete item ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                System.out.println(tracker.delete(id));
            } else if (select == 4) {
                System.out.println("=== Create a Find item by Id ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                System.out.println(tracker.findById(id));
            } else if (select == 5) {
                System.out.println("=== Create a Find items by name ====");
                System.out.print("Enter key: ");
                String key = scanner.nextLine();
                Item[] items = tracker.findByName(key);
                for (int i = 0; i < items.length; i++) {
                    System.out.println(items[i]);
                }
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
