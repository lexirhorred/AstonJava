package task2.homework.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ImmutablePerson {
    private final String name;
    private final int age;
    private final List<String> hobbies;

    public ImmutablePerson(String name, int age, ArrayList<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    public List<String> getHobbies() {
        return this.hobbies;
    }
}
