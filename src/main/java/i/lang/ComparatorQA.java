package i.lang;

import java.util.Comparator;

public class ComparatorQA {

    static Comparator<Object> hashCodeOrder = new Comparator<>() {
        public int compare(Object o1, Object o2) {
            return Integer.compare(o1.hashCode(), o2.hashCode());
        }
    };

    static Comparator<Object> hashCodeOrder2 =
            Comparator.comparingInt(o -> o.hashCode());
}
