package homework2.task2;

import java.util.ArrayList;
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

//    public void setName(String newName) {
//        this.name = newName;
//    }
//
//    public void setAge(int newAge) {
//        this.age = newAge;
//    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public List<String> getHobbies() {
        return this.hobbies;
    }
}
