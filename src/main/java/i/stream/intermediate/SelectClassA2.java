package i.stream.intermediate;

import org.w3c.dom.Element;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SelectClassA2 {
    public static void main(String[] args) {
        org.w3c.dom.NodeList nodeList = null;

        // выбрать из стрима все элементы класса Element
        select(IntStream.range(0, nodeList.getLength())
                        .mapToObj(nodeList::item)
                , Element.class)
                .forEach(e -> System.out.println(e.getTagName()));
    }

    static <T, TT> Stream<TT> select(Stream<T> stream, Class<TT> clazz) {
        return stream.filter(clazz::isInstance).map(clazz::cast);
    }
}
