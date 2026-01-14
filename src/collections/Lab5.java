package collections;

import java.util.*;
import java.util.stream.Collectors;

public class Lab5 {
    public static void lab5(){
        List<Integer> numbers =
                Arrays.asList(15, 20, 8, 20, 14, 13, 16, 15, 22, 23);

        List<Integer> result = numbers.stream()
                .filter(n-> n>5)
                .distinct()
                .map(n->n*2)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());


        Set<String> names =
                new HashSet<>(Arrays.asList(
                        "Alice", "Bob", "Alex", "Brian", "Anna", "Bob"
                ));

        names.stream().filter(n->n.length()>3)
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        Map<Integer, String> students = new HashMap<>();
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Alex"       );
        students.put(104, "Brian");
        students.put(105, "Anna");

        String studentsName = students.entrySet().stream()
                .filter(e->e.getKey()>102)
                .map(e->e.getValue().toUpperCase())
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(", "));

        System.out.println(studentsName);

    }
}
