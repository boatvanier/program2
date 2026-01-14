package collections;

import java.util.*;
import java.util.stream.Collectors;

public class StreamLambda {
    public static void compareExamples(){
        //Select even numbers
        //Multiply them by 10
        //Print the result
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        //Loop
        for (int n : numbers) {
            if (n % 2 == 0) { //check
                int result = n * 10; //calculate
                System.out.println(result);  // print
            }
        }

        // functional programming style
        numbers.stream()
                .filter(n -> n % 2 == 0) //select with condition
                .map(n -> n * 10) //transform the data
                .forEach(System.out::println); //perform an action

    }

    public static void moreExamples(){
        // =========================
        // LIST EXAMPLES
        // =========================
        List<Integer> numbers =
                Arrays.asList(5, 2, 8, 2, 10, 3, 6, 5);
        
        numbers.stream()
                .filter(n -> n % 2 == 0)    // select only even numbers
                .distinct()                 // remove duplicate values
                .sorted()                   // sort numbers in ascending order
                .map(n -> n * 10)            // transform each number
                .forEach(System.out::println); // print each result
        
        List<Integer> resultList =
                numbers.stream()
                        .filter(n -> n > 4)       // keep numbers greater than 4
                        .sorted()                 // sort the stream
                        .limit(3)                 // take first 3 elements
                        .map(n -> n + 1)           // add 1 to each element
                        .collect(Collectors.toList()); // collect into a List
        

        // =========================
        // SET EXAMPLES
        // =========================
        Set<String> names =
                new TreeSet<>(Arrays.asList(
                        "Alice", "Bob", "Alex", "Brian", "Anna", "Bob"
                ));

        boolean anyALongName = names.stream()
                .filter(name -> name.startsWith("A")) // select names starting with A
                .anyMatch(name -> name.length() > 5); // length > 5

        System.out.println("Set: Any name starting with A and length > 5? " + anyALongName);

        long count =
                names.stream()
                        .filter(name -> name.length() > 3) // names longer than 3 characters
                        .distinct()                         // ensure uniqueness
                        .count();                           // count the elements

        System.out.println("Count: " + count);

        // =========================
        // MAP EXAMPLES
        // =========================
        Map<Integer, String> students = new HashMap<>();
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Alex"       );
        students.put(104, "Brian");
        students.put(105, "Anna");
        String result = students.entrySet().stream()
                .filter(entry -> entry.getKey() > 102)    // select entries with key > 102
                .sorted(Comparator.comparing(Map.Entry::getKey))       // sort entries by key
                .map(entry -> entry.getValue().toUpperCase()) // transform values
                .collect(Collectors.joining(","));            // join to string
        System.out.println(result);

        // names starting with A
        Map<Integer, String> filteredMap =
                students.entrySet().stream()
                        .filter(entry -> entry.getValue().startsWith("A"))               // sort by value
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,      // key mapper
                                Map.Entry::getValue     // value mapper
                        ));
    }
}
