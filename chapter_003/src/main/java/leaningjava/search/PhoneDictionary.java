package leaningjava.search;

import leaningjava.search.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class PhoneDictionary {
    private List<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     *  public List<Person> find(String key) {
     *         List<Person> result = new ArrayList<>();
     *         for (Person value : persons) {
     *             if (value.getName().contains(key)) {
     *                 result.add(value);
     *             } else if (value.getSurname().contains(key)) {
     *                 result.add(value);
     *             } else if (value.getAddress().contains(key)) {
     *                 result.add(value);
     *             } else if (value.getPhone().contains(key)) {
     *                 result.add(value);
     *             }
     *         }
     *         return result;
     *     }
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> getNames = x -> x.getName().contains(key);
        Predicate<Person> getSurnames = x -> x.getSurname().contains(key);
        Predicate<Person> getAddress = x -> x.getAddress().contains(key);
        Predicate<Person> getPhones = x -> x.getPhone().contains(key);
        Predicate<Person> getNameSurname = getNames.or(getSurnames);
        Predicate<Person> getAddresPhone = getAddress.or(getPhones);
        Predicate<Person> combine = getNameSurname.or(getAddresPhone);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
