package i.stream.term;

import java.util.stream.Stream;

public class Unique {
    public static void main(String[] args) {
        // Проверить уникальны ли входные элементы
        Stream.of("A", "B", "C", "D", "B");
    }
}
