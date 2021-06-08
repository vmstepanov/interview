package i.stream.intermediate;

import java.util.Random;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class TakeWhileA {
    public static void main(String[] args) {
        // new Random().ints().boxed().limit(20).forEach(c-> System.out.println(c + " " + (c % 10)));
        takeWhile(new Random().ints().boxed(), x -> x % 10 != 0).forEach(System.out::println);
    }

    static <T> Stream<T> takeWhile(Stream<T> stream, Predicate<T> predicate) {
        Spliterator<T> src = stream.spliterator();
        Spliterator<T> res = new Spliterators.AbstractSpliterator<T>(src.estimateSize(),
                src.characteristics() & ~Spliterator.SIZED & ~Spliterator.SUBSIZED) {

            boolean finished = false;
            T next;
            @Override
            public boolean tryAdvance(Consumer<? super T> action) {
                if (finished || !src.tryAdvance(t -> next =t) || !predicate.test(next)) {
                    finished = true;
                    return false;
                }
                action.accept(next);
                return true;
            }
        };

        return StreamSupport.stream(res, stream.isParallel()).onClose(stream::close);

    }
}
