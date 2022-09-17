package DesignPatternUsingLambdas;

import java.util.function.Function;

public class PlayWithComparators {

    public static void main(String[] args) {

        Person mary = new Person("Mary", 28);
        Person john = new Person("John", 22);
        Person linda = new Person("Linda", 26);
        Person james = new Person("James", 32);

        Function<Person, String> getName = p -> p.getName();
        Function<Person, Integer> getAge = p -> p.getAge();

        Comparator<Person> cmpName = Comparator.comparing(getName);

        System.out.println("Mary > John: " + (cmpName.compare(mary, john) > 0));
        System.out.println("John > James: " + (cmpName.compare(john, james) > 0));
        System.out.println("Linda > John: " + (cmpName.compare(linda, john) > 0));


    }

}
