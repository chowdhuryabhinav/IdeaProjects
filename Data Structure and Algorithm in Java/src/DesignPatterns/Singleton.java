package DesignPatterns;

/*
Design -
1. Static in nature

2. Needs to be thread safe

3. Private instance

4. Private Constructor

5. No parameters required

Pitfalls -
1. Difficult to unit test

2. java.util.CALENDAR is not a SINGLETON . Instead it is a prototype
 */
public class Singleton {

    public static void main(String[] args) {
        Runtime singletonRuntime = Runtime.getRuntime();

        singletonRuntime.gc();

        System.out.println(singletonRuntime);

        Runtime singletonRuntime2 = Runtime.getRuntime();

        if (singletonRuntime == singletonRuntime2) {
            System.out.println("They are the same instance");
        }


    }
}
