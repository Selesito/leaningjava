package leaningjava.search;

import leaningjava.search.Person;

import java.util.ArrayList;
import java.util.List;

public class PhoneDictionary {
    private List<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public List<Person> find(String key) {
        List<Person> result = new ArrayList<>();
        for (Person value : persons) {
            if (value.getName().contains(key)) {
                result.add(value);
            } else if (value.getSurname().contains(key)) {
                result.add(value);
            } else if (value.getAddress().contains(key)) {
                result.add(value);
            } else if (value.getPhone().contains(key)) {
                result.add(value);
            }
        }
        return result;
    }
}
