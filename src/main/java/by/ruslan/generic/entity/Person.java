package by.ruslan.generic.entity;

public class Person {
    static int counter = 1;
    private long id;

    public Person(){
        id = counter++;
    }

    public long getId() {
        return id;
    }
}
