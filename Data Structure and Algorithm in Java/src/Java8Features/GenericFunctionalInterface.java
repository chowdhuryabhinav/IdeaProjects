package Java8Features;

@FunctionalInterface
interface I<T> {
    public abstract T m1(T x);
}

public class GenericFunctionalInterface {

    public static void main(String[] args) {
        I<Integer> obj1 = (x) -> {
            System.out.println("lambda integer:" + x);
            return 222;
        };

        System.out.println(obj1.m1(111));
    }
}
