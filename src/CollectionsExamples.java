import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionsExamples {
    // NO GOOD: List<String> list = new List<>();


    static void arrayListExample(){
        List<String> names = new ArrayList<>();

        // add elements
        names.add("Alice");
        names.add("Bob");
        names.add("Alice"); // duplicate allowed

        // add at index
        names.add(1, "Charlie");

        System.out.println(names);
        // [Alice, Charlie, Bob, Alice]

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

    static void linkedListExample(){
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
}
