package i.lang.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;

public class LambdaTask1A {

    public static void main(String[] args) {

        // запишите через ссылку на метод
        Supplier<List<String>> supplier = ArrayList::new;

        // запишите через ссылку на метод копирующий конструктор
        Function<List<String>, List<String>> func = ArrayList::new;

        // Запишите через java.util.function левую часть выражения
        IntFunction<String[]> x = String[]::new;

    }
}
