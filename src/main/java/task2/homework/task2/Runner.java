package task2.homework.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        MutablePerson mPerson = new MutablePerson("Peter", 30, Arrays.asList("Engineering", "Reading"));
        mPerson.age = 35;

        ImmutablePerson imPerson = new ImmutablePerson("Vika", 20, Arrays.asList("Swimming", "Singing", "Needlework"));
        imPerson.age = 25;
    }
}
