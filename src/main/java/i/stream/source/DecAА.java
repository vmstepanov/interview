package i.stream.source;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class DecAА {
    public static void main(String[] args) {
        List<List<String>> source = asList(asList("Mac", "Win", "Linux"), asList("C", "Java"), asList("11", "14"));
        // MacC11 MacC14 MacJava11 MacJava14 WinC11 WinC14 WinJava11 WinJava14 LinuxC11 LinuxC14 LinuxJava11 LinuxJava14

        Supplier<Stream<String>> s = source.stream()
                .<Supplier<Stream<String>>>map(list-> list::stream)
                .reduce((sup1, sup2) -> ()->sup1.get().flatMap(e1 -> sup2.get().map(e2 -> e1 + e2)))
                .orElse(() -> Stream.of(""));
        s.get().forEach(System.out::println);
    }
}
