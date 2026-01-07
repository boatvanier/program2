import java.io.File;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // factorial
//        int result = Recursion.factorial(5);
//        System.out.println(result); // Output: 120
//        result = Recursion.recursiveFactorial(5);
//        System.out.println(result); // Output: 120

        //Palindrome
        String word = "level";
        if (Recursion.isPalindrome(word, 0, word.length() - 1)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

        //Fabonacci
        //System.out.println(Recursion.fib(6));


        //File
        //File root = new File("C:/GitHub"); // change path
        //Recursion.listFiles(root);
    }

}