import oop.Book;
import oop.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // factorial
//        int result = recursion.Recursion.factorial(5);
//        System.out.println(result); // Output: 120
//        result = recursion.Recursion.recursiveFactorial(5);
//        System.out.println(result); // Output: 120

        //Palindrome
//        String word = "level";
//        if (recursion.Recursion.isPalindrome(word, 0, word.length() - 1)) {
//            System.out.println(word + " is a palindrome.");
//        } else {
//            System.out.println(word + " is not a palindrome.");
//        }

        //Fabonacci
        //System.out.println(recursion.Recursion.fib(6));


        //File
        //File root = new File("C:/GitHub"); // change path
        //recursion.Recursion.listFiles(root);


        // Binary Search
//        int[] numbers = {2, 4, 6, 8, 10, 12, 14};
//        int target = 16;
//        int index = recursion.BinarySearch.binarySearch(numbers, target, 0, numbers.length - 1);
//        System.out.println(index); // Output: 4

//        Lab2
//        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 2, 3, 4, 1, 2, 3));
//        System.out.println("Q1: Longest Consecutive Increasing = " + longestConsecutiveIncreasing(list1));
//
//        List<Integer> list2 = new ArrayList<>(List.of(2, 1, 3));
//        System.out.println("Q2: Count of Ordered Pairs = " + countOrderedPairs(list2));

//        Lab3.lab3();

//        CollectionsExamples.mapExample();

        //Lab4.lab4();

//        StreamLambda.moreExamples();
//        Lab5.lab5();


        Book b1 = new Book("book1", "author1", "000000000000001", 10);
        Book b2 = new Book("book2", "author2", "000000000000002", 12);

        b1.setPrice(-1);
        System.out.println(b1.getPrice());
        b1.applyDiscount(0.2);

        b1.displayBookInfo();
        b2.displayBookInfo();
    }

}