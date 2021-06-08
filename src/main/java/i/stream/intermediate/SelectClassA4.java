package i.stream.intermediate;

import one.util.streamex.IntStreamEx;
import org.w3c.dom.Element;

public class SelectClassA4 {
    public static void main(String[] args) {
        org.w3c.dom.NodeList nodeList = null;

        // выбрать из стрима все элементы класса Element
        IntStreamEx.range(0, nodeList.getLength())
                .mapToObj(nodeList::item)
                .select(Element.class)
        .forEach(e -> System.out.println(e.getTagName()));
    }
}
