package i.model;

public class Person {
    private Child[] children = {new Child("Max", 1), new Child("Kate", 10)};
    public Child get(int i) {
        return children[i];
    }
    public int getSize() {
        return children.length;
    }
}

