package i.lang;

import java.util.Comparator;

public class ComparatorQ {
    static Comparator<Object> cc = new Comparator<>() {
        public int compare(Object o1, Object o2) {
            return o1.hashCode() - o2.hashCode();
        }
    };
}
