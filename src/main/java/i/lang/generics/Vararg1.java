package i.lang.generics;

public class Vararg1 {

    static <T> T[] toArray(T... args) {
        return args;
    }

    static <T> T[] pick(T a, T b, T c) {
        return toArray(a, b, c);
    }

    public static void main(String[] args) {
        Object[] attributes = pick("Good", "Fast", "Cheap");
    }
}
