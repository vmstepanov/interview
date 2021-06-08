package i.stream.term;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class ConvertA {
    /*
    Преобразовать List<Map<K,V>> -> Map<K, List<V>>

    [ {a=1, b=2},
      {a=3, d=4, e=5},
      {a=5, b=6, e=7}
    ]

    {a=[1, 3, 5],
     b=[2, 6]
     d=[4]
     e=[5, 7]

     */
    public static void main(String[] args) {

        List<Map<String, Integer>> input = new ArrayList<>();
        input.add(Map.of("a", 1, "b", 2));
        input.add(Map.of("a", 3, "d", 4, "e", 5));
        input.add(Map.of("a", 5, "b", 6, "e", 7));

        ConvertA a = new ConvertA();
        System.out.println(a.convert(input));

    }

    <K, V> Map<K, List<V>> convert(List<Map<K,V>> input) {
        return input.stream()
                .flatMap(map -> map.entrySet().stream())
                .collect(groupingBy(Map.Entry::getKey, mapping(Map.Entry::getValue, toList())));
    }

}
