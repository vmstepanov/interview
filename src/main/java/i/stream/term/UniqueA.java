package i.stream.term;

import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

public class UniqueA {
    public static void main(String[] args) {
        // Проверить уникальны ли входные элементы
        System.out.println(Stream.of("A", "B", "C", "D", "B")
        .allMatch(ConcurrentHashMap.newKeySet()::add));
    }
}
