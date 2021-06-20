package i.lang.lambda;

public class Adder {


    public static void main(String[] args) {
        IAdder adder = (x, y) -> x + y;
        IAdder adder2 = (double x, double y) -> x + y;
        if (adder.equals(adder2))
            System.out.println(111);
    }
}

interface IAdder {
    double add(double n1, double n2);
}
