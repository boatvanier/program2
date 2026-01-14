package collections;

import java.util.*;

public class Lab4 {
    public static void lab4() {
    /* =========================
       Q1. List<Integer>
       ========================= */
        List<Integer> numbers = new ArrayList<>(Arrays.asList(12, 7, 5, 20, 33, 8, 14, 2, 9, 18));

        System.out.println("Q1 - Even numbers:");
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int n : numbers) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
            max = Math.max(max, n);
            sum += n;
        }
        System.out.println("Largest number: " + max);
        System.out.println("Sum of numbers: " + sum);


    /* =========================
       Q2. List<Double> sorting
       ========================= */
        List<Double> prices = new ArrayList<>(Arrays.asList(19.99, 5.49, 12.75, 30.00, 8.99));

        Collections.sort(prices);
        System.out.println("Q2 - Prices Ascending: " + prices);

        prices.sort(Collections.reverseOrder());
        System.out.println("Prices Descending: " + prices);

    /* =========================
       Q3. Set<String>
       ========================= */
        Set<String> languages = new HashSet<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");
        languages.add("C#");
        languages.add("Go");
        languages.add("Java");      // duplicate
        languages.add("Python");    // duplicate

        System.out.println("Q3 - Languages Set: " + languages);
        System.out.println("Contains Java? " + languages.contains("Java"));

        languages.remove("Python");
        System.out.println("After removing Python: " + languages);


    /* =========================
       Q4. List to Set
       ========================= */
        List<Integer> listWithDuplicates = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> uniqueSet = new HashSet<>(listWithDuplicates);

        System.out.println("Q4 - List: " + listWithDuplicates);
        System.out.println("Set: " + uniqueSet);
        System.out.println("Explanation: Set removes duplicates automatically.");


    /* =========================
       Q5. Unique characters using Set
       ========================= */
        String input = "programming";
        Set<Character> uniqueChars = new HashSet<>();

        for (char c : input.toCharArray()) {
            uniqueChars.add(c);
        }
        System.out.println("Q5 - Unique characters: " + uniqueChars);


    /* =========================
       Q6. TreeSet<Integer>
       ========================= */
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(45, 12, 78, 34, 89, 23, 5));

        System.out.println("Q6 - TreeSet sorted: " + treeSet);
        System.out.println("Smallest: " + treeSet.first());
        System.out.println("Largest: " + treeSet.last());


    /* =========================
       Q7. Common elements in two Sets
       ========================= */
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7));

        Set<Integer> common = new HashSet<>(set1);
        common.retainAll(set2);

        System.out.println("Q7 - Common elements: " + common);


    /* =========================
       Q8. Map<Integer, String>
       ========================= */
        Map<Integer, String> employees = new HashMap<>();
        employees.put(101, "Alice");
        employees.put(102, "Bob");
        employees.put(103, "Charlie");
        employees.put(104, "David");
        employees.put(105, "Eva");

        System.out.println("Q8 - Employees:");
        System.out.println(employees);

        System.out.println("Employee with ID 103: " + employees.get(103));
        employees.remove(102);
        System.out.println("After removal: " + employees);


    /* =========================
       Q9. Word frequency using Map
       ========================= */
        String sentence = "java is easy and java is powerful";
        String[] words = sentence.split(" ");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Q9 - Word frequency:");
        System.out.println(wordCount);


    /* =========================
       Q10. Students marks
       ========================= */
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Tom", 85);
        marks.put("Jerry", 78);
        marks.put("Anna", 92);
        marks.put("Mike", 66);
        marks.put("Sophia", 88);

        int total = 0;
        System.out.println("Q10 - Students scoring > 80:");

        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            total += entry.getValue();
            if (entry.getValue() > 80) {
                System.out.println(entry.getKey());
            }
        }
        System.out.println("Average marks: " + (total / (double) marks.size()));


    /* =========================
       Q11. Map iteration
       ========================= */
        Map<Integer, String> sampleMap = new HashMap<>();
        sampleMap.put(1, "One");
        sampleMap.put(2, "Two");
        sampleMap.put(3, "Three");

        System.out.println("Q11 - keySet():");
        for (Integer key : sampleMap.keySet()) {
            System.out.println(key + sampleMap.get(key));
        }

        System.out.println("values():");
        for (String value : sampleMap.values()) {
            System.out.println(value);
        }

        System.out.println("entrySet():");
        for (Map.Entry<Integer, String> entry : sampleMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }


    /* =========================
       Q12. Default value in Map
       ========================= */
        Map<String, Integer> stock = new HashMap<>();
        stock.put("Apple", 50);
        stock.put("Banana", 30);

        int mangoStock = stock.getOrDefault("Mango", 0);
        System.out.println("Q12 - Mango stock: " + mangoStock);


    /* =========================
       Q13. Name length Map
       ========================= */
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        Map<String, Integer> nameLengthMap = new HashMap<>();
        for (String name : names) {
            nameLengthMap.put(name, name.length());
        }

        System.out.println("Q13 - Name Length Map:");
        System.out.println(nameLengthMap);


    /* =========================
       Q14. Country-Capital
       ========================= */
        Map<String, String> countryCapital = new HashMap<>();
        countryCapital.put("Canada", "Ottawa");
        countryCapital.put("USA", "Washington");
        countryCapital.put("France", "Paris");

        Set<String> countries = countryCapital.keySet();
        List<String> capitals = new ArrayList<>(countryCapital.values());

        System.out.println("Q14 - Countries: " + countries);
        System.out.println("Capitals: " + capitals);


    /* =========================
       Q15. Find duplicates using Set
       ========================= */
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6);
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int n : list) {
            if (!seen.add(n)) {
                duplicates.add(n);
            }
        }

        System.out.println("Q15 - Duplicate elements: " + duplicates);
    }
}
