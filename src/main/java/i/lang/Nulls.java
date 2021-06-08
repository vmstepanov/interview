package i.lang;

public class Nulls {

    public static void main(String[] args) {
        Object vms   = new Object();
        Object ant   = new Object();

        Object[] arr = new Object[2];
        arr[0] = vms;
        arr[1] = ant;

        Object x = arr[1];
        arr[1] = null;
        System.out.println(x);

        Object y = ant;
        y = null;
        System.out.println(ant);

        Object z = ant;
        ant = null;
        System.out.println(z);
    }
}
