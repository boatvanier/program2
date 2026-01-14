package collections;

import java.util.*;

public class CollectionsExamples {
    // NO GOOD: List<String> list = new List<>();
    public static void arrayListExample(){
        List<String> names = new ArrayList<>();

        // add elements
        names.add("Alice");
        names.add("Bob");
        names.add("Alice"); // duplicate allowed

        // add at index
        names.add(1, "Charlie");

        System.out.println(names);
        // [Alice, Charlie, Bob, Alice]
//        List<String> temps = new ArrayList<>();
//        temps.add("Alice");
//        temps.add("Bob");
//        names.retainAll(temps);
//
//        names.remove("Alice");
//        System.out.println(names);
        // access element
        System.out.println(names.get(0)); // Alice

        // update element
        names.set(2, "David");
        System.out.println(names);

        // remove by index
        names.remove(1);
        System.out.println(names);

        // remove by value
        names.remove("Alice"); // removes first occurrence
        System.out.println(names);

        // size
        System.out.println("Size: " + names.size());

        // contains
        System.out.println(names.contains("Alice"));

        // iterate
        names.add("Bob");
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void linkedListExample(){
        List<Integer> numbers = new LinkedList<>();

        // add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // add at index
        numbers.add(1, 15);

        System.out.println(numbers);

        // remove by index
        numbers.remove(2);
        // [10 ,15 ,30]
        // update element by index
        numbers.set(1, 26);
        // [10, 26, 30]

        // iterate using iterator
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        numbers.addFirst(0);
        System.out.println(numbers);
    }

    public static void setExample(){
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java");   // ignored
        set.add("C#");

        System.out.println(set);
        if (set.contains("Java")) {
            System.out.println("Java exists");
        }

        set.remove("Python");
        System.out.println(set.size());

        if (set.isEmpty()) {
            System.out.println("Set is empty");
        }

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Set<Integer> a = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> b = new HashSet<>(Set.of(3, 4, 5));

        a.addAll(b); // union
        System.out.println(a); // [1,2,3,4,5]

        a.retainAll(Set.of(2, 3, 6)); //intersection
        System.out.println(a); // [2, 3]

        a.removeAll(Set.of(3));
        System.out.println(a); // [2]
    }

    public static void mapExample(){
            // 1. Create a Map (Program to interface)
            Map<Integer, String> students = new HashMap<>();

            // 2. Add elements (put)
            students.put(101, "Alice");
            students.put(102, "Bob");
            students.put(103, "Charlie");
            students.put(104, "David");

            // 3. Print Map
            System.out.println("All students: " + students);

            // 4. Get value by key
            System.out.println("Student with ID 102: " + students.get(102));

            // 5. Check if key exists
            System.out.println("Contains key 103? " + students.containsKey(103));

            // 6. Check if value exists
            System.out.println("Contains value 'Alice'? " + students.containsValue("Alice"));

            // 7. Replace value
            students.replace(104, "Daniel");
            System.out.println("After replacing ID 104: " + students);

            // 8. Remove element
            students.remove(101);
            System.out.println("After removing ID 101: " + students);

            // 9. Get default value if key not found
            System.out.println("ID 105: " + students.getOrDefault(105, "Not Found"));

            // 10. Iterate using keySet()
            System.out.println("\nUsing keySet():");
            for (Integer id : students.keySet()) {
                System.out.println(id + " -> " + students.get(id));
            }

            // 11. Iterate using values()
            System.out.println("\nUsing values():");
            for (String name : students.values()) {
                System.out.println(name);
            }

            // 12. Iterate using entrySet() (MOST COMMON)
            System.out.println("\nUsing entrySet():");
            for (Map.Entry<Integer, String> entry : students.entrySet()) {
                System.out.println(entry.getKey() + " => " + entry.getValue());
            }

            // 13. Size of map
            System.out.println("\nTotal students: " + students.size());

            // 14. Clear map
            students.clear();
            System.out.println("Is map empty? " + students.isEmpty());
    }

    public static void collectionsMethodExamples() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(1);
        list.add(7);

        System.out.println("Original List: " + list);

        // 1. Collections.sort(list) - Sort in ascending order
        Collections.sort(list);
        System.out.println("Sorted List (Ascending): " + list);

        // 2. Collections.reverse(list) - Reverse the order
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);

        // 3. Collections.max(list) - Find the maximum value
        int max = Collections.max(list);
        System.out.println("Maximum Value: " + max);

        // 4. Collections.min(list) - Find the minimum value
        int min = Collections.min(list);
        System.out.println("Minimum Value: " + min);

        // 5. Collections.shuffle(list) - Randomly shuffle the list
        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);
    }


}
