package task2.homework.task2;

import java.util.ArrayList;
import java.util.List;

public class MutablePerson {
    String name;
    int age;
    List<String> hobbies;

    public MutablePerson(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    public List<String> getHobbies() {
        return this.hobbies;
    }
}
