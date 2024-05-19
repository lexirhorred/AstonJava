package homework2.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        MutablePerson mPerson = new MutablePerson("Peter", 30, new ArrayList<String>(Arrays.asList("Engineering", "Reading")));
        mPerson.getHobbies().add("New hobby");
        System.out.println(mPerson.getHobbies().toString());

        ImmutablePerson imPerson = new ImmutablePerson("Vika", 20, new ArrayList<String>(Arrays.asList("Swimming", "Singing", "Needlework")));
        imPerson.getHobbies().add("New hobby");
        System.out.println(imPerson.getHobbies().toString());
    }
}
