package i.stream.intermediate;

import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TakeWhile {
    public static void main(String[] args) {
        //new Random().ints().boxed().filter(takeWhile(x -> x % 10 != 0)).forEach(System.out::println);
        Stream.of(1,2,3,4, -1, 5, 6, 7, 8).filter(takeWhile(x-> x>0)).forEach(System.out::println);
    }

    static <T> Predicate<T> takeWhile(Predicate<T> predicate) {
        AtomicBoolean matched = new AtomicBoolean();
        return t -> {
            if (matched.get())
                return false;
            if (!predicate.test(t)) {
                matched.set(true);
                return false;
            }
            return true;
        };

    }
}
