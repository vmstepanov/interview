package i.collection;

import java.util.AbstractMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateMapBefore9A {

    public static void main(String[] args) {

        Map<String, String> map = Stream.of(new String[][] {{"x", "1"}, {"y", "2"}}).collect(Collectors.toMap(data->data[0], data->data[1]));
        System.out.println(map.getClass());
        System.out.println(map);

        Map<String, Integer> map2 = Stream.of(new AbstractMap.SimpleEntry<String, Integer>("idea", 1), new AbstractMap.SimpleEntry<String, Integer>("stuff", 2)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(map2.getClass());
        System.out.println(map2);
    }
}
