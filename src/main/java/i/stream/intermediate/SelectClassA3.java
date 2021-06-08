package i.stream.intermediate;

import org.w3c.dom.Element;

import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SelectClassA3 {
    public static void main(String[] args) {
        org.w3c.dom.NodeList nodeList = null;

        // выбрать из стрима все элементы класса Element
        IntStream.range(0, nodeList.getLength())
                .mapToObj(nodeList::item)
                .flatMap(select(Element.class))
        .forEach(e -> System.out.println(e.getTagName()));
    }

    static <T, TT> Function<T, Stream<TT>> select(Class<TT> clazz) {
        return e -> clazz.isInstance(e) ? Stream.of(clazz.cast(e)) : null;
    }
}
