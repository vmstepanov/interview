package i.stream.intermediate;

import org.w3c.dom.Element;

import java.util.stream.IntStream;

public class SelectClassA1 {
    public static void main(String[] args) {
        org.w3c.dom.NodeList nodeList = null;

        // выбрать из стрима все элементы класса Element
        IntStream.range(0, nodeList.getLength())
                .mapToObj(nodeList::item)
                .filter(node -> node instanceof Element)
                .map(node -> (Element) node);

        IntStream.range(0, nodeList.getLength())
                .mapToObj(nodeList::item)
                .filter(node -> node instanceof Element)
                .map(Element.class::cast);
    }
}
