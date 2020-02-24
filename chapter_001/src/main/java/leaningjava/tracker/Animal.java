package leaningjava.tracker;

public class Animal {
    private String name;

    public Animal(String name) {
        super();
        System.out.println("load Animal");

    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger("Vasya");
    }
}
