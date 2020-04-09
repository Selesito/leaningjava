package leaningjava.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<Task>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставки использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        //TODO добавить вставку в связанный список.
        int insert = 0;
        for (Task t : tasks) {
            if (task.getPriority() < t.getPriority()) {
                break;
            }
            insert++;
        }
        tasks.add(insert, task);


    }

    public Task take() {
        return this.tasks.poll();
    }
}
