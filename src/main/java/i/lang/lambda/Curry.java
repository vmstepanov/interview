package i.lang.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Curry {
    static <A,B,C> Function<? super A, Function<? super B, ? extends C>> curry(
            BiFunction<? super A, ? super B, ? extends C> fn
    ) {
        return a -> b -> fn.apply(a, b);
    }
}
