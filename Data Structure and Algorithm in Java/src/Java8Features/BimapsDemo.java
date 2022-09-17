package Java8Features;

import java.util.*;

public class BimapsDemo {

    public static void main(String[] args) {

        Person abhinav = new Person(26, "Abhinav", "M");
        Person manoj = new Person(39, "Manoj", "M");
        Person aishwaray = new Person(26, "Aishwaray", "M");
        Person anima = new Person(29, "Anima", "F");
        Person amit = new Person(35, "Amit", "M");
        Person rupali = new Person(30, "Rupali", "F");
        Person sakshi = new Person(26, "Sakshi", "F");

        List<Person> persons = new ArrayList<>();

        Map<Integer, Map<String, List<Person>>> bimap = new HashMap<>();

        persons.forEach(
                person ->
                        bimap.computeIfAbsent(
                                person.getAge(),
                                HashMap::new
                        ).merge(
                                person.getGender(),
                                new ArrayList<>(Arrays.asList(person)),
                                (l1, l2) -> {
                                    l1.addAll(l2);
                                    return l1;

                                }
                        )

        );

        bimap.forEach(
                (age, m) -> System.out.println(age + "->" + m)
        );

    }
}
