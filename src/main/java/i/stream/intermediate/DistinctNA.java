package i.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DistinctNA {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "C", "Ruby", "Java", "C", "Java", "Python", "C");

        Map<String, Long> counts = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        counts.values().removeIf(cnt -> cnt < 3);
        counts.keySet().forEach(System.out::println);
    }
}
