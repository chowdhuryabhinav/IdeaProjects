package DesignPatterns;

public class SingletonDemo {

    private static volatile SingletonDemo instance = null;

    private SingletonDemo() {

        if (instance != null) {
            throw new RuntimeException("Use getInstance() to create");
        }

    }

    public static SingletonDemo getInstance() {
        if (instance == null) {

            synchronized (SingletonDemo.class) {
                if (instance == null) {
                    instance = new SingletonDemo();
                }
            }
        }

        return instance;
    }
}
