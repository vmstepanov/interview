package i.collection;

import java.util.Map;

public class CreateMapBefore9 {

    public static void main(String[] args) {
        // создать и наполнить коллекцию в одну строку без использования сторонних библиотек
        Map<String, String> map = null;
        System.out.println(map.getClass());
        System.out.println(map);

        Map<String, Integer> map2 = null;
        System.out.println(map2.getClass());
        System.out.println(map2);
    }
}
