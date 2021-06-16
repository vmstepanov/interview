package i.stream.task1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task2 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 5, 5);

        Map<Integer, Long> result = numbers.stream()
                .filter(val -> val > 3)
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        System.out.println(result);

        result = numbers.stream()
                .collect(Collectors.groupingBy(i -> i,
                        Collectors.filtering(val -> val > 3, Collectors.counting())));

        System.out.println(result);
    }
}
