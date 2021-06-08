package i.stream.source;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class DecA {
    public static void main(String[] args) {
        List<List<String>> source = asList(asList("Mac", "Win", "Linux"), asList("C", "Java"), asList("11", "14"));
        // MacC11 MacC14 MacJava11 MacJava14 WinC11 WinC14 WinJava11 WinJava14 LinuxC11 LinuxC14 LinuxJava11 LinuxJava14

        Stream<String> s = source.get(0).stream().flatMap(a->
                source.get(1).stream().flatMap(b->
                        source.get(2).stream().map(c-> a + b + c)));
        s.forEach(System.out::println);
    }
}
