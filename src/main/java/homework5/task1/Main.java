package homework5.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> sourceList = new ArrayList<Integer>(
                Arrays.asList(-10, 17, 187, -24, -99, 10, -10, -99, 200, -100, 187, 53));
        Stream<Integer> stream = sourceList.stream();
        stream = stream.distinct().filter(x -> x % 2 == 0);

        System.out.println(sourceList);
        System.out.println(stream.mapToInt(Integer::intValue).sum());
    }
}
