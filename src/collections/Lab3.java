package collections;
import java.util.*;

public class Lab3 {
    public static void lab3(){
        // Q1: List Basics
        List<String> friends = new ArrayList<>();

        friends.add("John");
        friends.add("Emma");
        friends.add("Mike");
        friends.add("Sara");
        friends.add("David");

        // Normal for loop
        System.out.println("Normal for loop:");
        for (int i = 0; i < friends.size(); i++) {
            System.out.println(friends.get(i));
        }

        // Enhanced for loop
        System.out.println("\nEnhanced for loop:");
        for (String name : friends) {
            System.out.println(name);
        }

        friends.remove(2);              // remove 3rd element
        friends.set(0, "Alex");         // replace first element

        System.out.println("Contains John? " + friends.contains("John"));
        System.out.println("Final list: " + friends);

        // Q2: LinkedList Queue Simulation(FIFO-first in first out)
        List<Integer> queue = new LinkedList<>();

        queue.add(101);
        queue.add(102);
        queue.add(103);
        queue.add(104);
        queue.add(105);

        queue.removeFirst();        // remove first customer
        queue.add(106);         // add at end

        System.out.println("\nQueue elements:");
        Iterator<Integer> it = queue.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Q3: Sum & Average
        List<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(50) + 1);
        }

        int sum = 0;
        System.out.println("\nNumbers:");
        for (int n : numbers) {
            System.out.print(n + " ");
            sum += n;
        }

        double average = (double) sum / numbers.size();
        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);

        numbers.removeIf(n -> n > 40);
        System.out.println("After removing > 40: " + numbers);

        // Q4: Merge Two Lists
        List<String> list1 = new LinkedList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");

        List<String> list2 = new LinkedList<>();
        list2.add("Banana");
        list2.add("Grapes");
        list2.add("Apple");

        for (String item : list2) {
            if (!list1.contains(item)) {
                list1.add(item);
            }
        }

        System.out.println("\nMerged list:");
        for (String item : list1) {
            System.out.println(item);
        }

        // Q5: Reverse List Manually
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }

        System.out.println("\nReversed list: " + list);
    }
}
