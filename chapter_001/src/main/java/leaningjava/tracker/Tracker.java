package leaningjava.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
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
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getId().equals(id)) {
            items[i] = item;
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
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getId().equals(id)) {
                System.arraycopy(items, i + 1, items, i, items.length - i - 1);
                result = true;
                this.position--;
                break;
            }
        }
        return result;
    }

    /**
     * Метод должен возвращаеть копию массива this.items без null элементов.
     */
    public Item[] findAll() {
        Item[] temp = new Item[position];
        System.arraycopy(items, 0, temp, 0, position);
        return temp;
    }
    /**
     * Метод должен проверяеть в цикле все элементы массива this.items, сравнивая name.
     * @return Элементы, у которых совпадает name, копирует в результирующий массив и возвращает его.         *
     */

    public Item[] findByName(String key) {
        Item[] temp = new Item[position];
        int count = 0;
        for (int i = 0; i < position; i++) {
            if (items[i] != null && items[i].getName().equals(key)) {
                temp[i] = items[i];
                count++;
            }
        }
        Item[] all = new Item[count];
        System.arraycopy(temp, 0, temp, 0, count);
        return all;
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
