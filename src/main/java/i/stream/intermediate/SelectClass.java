package i.stream.intermediate;

import java.util.stream.IntStream;

public class SelectClass {
    public static void main(String[] args) {
        org.w3c.dom.NodeList nodeList = null;

        // выбрать из стрима все элементы класса Element
        IntStream.range(0, nodeList.getLength())
                .mapToObj(nodeList::item);


    }
}
