package leaningjava.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final ArrayList<Item> items = new ArrayList<>();

    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items.add(item);
        return item;
    }

    /**
     * Метод должен заменить ячейку в массиве.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Для этого необходимо найти ячейку в массиве по id.
     * @return boolean рузельтат удалось или нет.
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
            items.add(item);
            result = true;
            break;
            }
        }
        return result;
    }

    /**
     * Метод  должен удалить ячейку в массиве this.items.
     * Для этого необходимо найти ячейку в массиве по id.
     * @return boolean рузельтат удалось или нет.
     */

    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
                items.trimToSize();
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод должен возвращаеть копию массива this.items без null элементов.
     */
    public ArrayList<Item> findAll() {
        ArrayList<Item> temp = new ArrayList<Item>();
        for (Item value : items) {
            temp.add(value);
        }
        temp.trimToSize();
        return temp;
    }
    /**
     * Метод должен проверяеть в цикле все элементы массива this.items, сравнивая name.
     * @return Элементы, у которых совпадает name, копирует в результирующий массив и возвращает его.         *
     */

    public ArrayList<Item> findByName(String key) {
        ArrayList<Item> temp = new ArrayList<Item>();
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName().equals(key)) {
                temp.add(items.get(i));
            }
        }
        temp.trimToSize();
        return temp;
    }

    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
}
