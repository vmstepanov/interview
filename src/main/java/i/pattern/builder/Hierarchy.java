package i.pattern.builder;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hierarchy {
    public static void main(String[] args) {
        //Dev d = new Dev.Builder().lang("java").name("Peter").ver(8).build();
        //System.out.println(d);

        BigDecimal bd1 = new BigDecimal("1.00");
        BigDecimal bd2 = new BigDecimal("1.0");
        Set set = new TreeSet();
        set.add(bd1);
        set.add(bd2);
        System.out.println(set.size());
    }
}
class Person {
    String name;
    abstract static class Builder<T> {
        String name;
        abstract T self();
        T name(String name) {
            this.name = name;
            return self();
        }
        Person build() {
            return new Person(this);
        }
    }
    Person(Builder b) {
        name = b.name;
    }
}
class Dev extends Person {
    String lang;
    int ver;
    @Override
    public String toString() {
        return "Dev{" + "name='" + name + ", lang='" + lang + ", ver=" + ver + '}';
    }
    static class Builder extends Person.Builder {
        String lang;
        int ver;
        Builder lang(String lang) {
            this.lang = lang;
            return this;
        }
        Builder ver(int ver) {
            this.ver = ver;
            return this;
        }
        @Override
        Builder self() {
            return this;
        }
        Dev build() {
            return new Dev(this);
        }
    }
    Dev(Builder b) {
        super(b);
        lang = b.lang;
        ver = b.ver;
    }
}

