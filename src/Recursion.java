import java.io.File;

public class Recursion {

    static int factorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;
    }

    static int recursiveFactorial(int n) {
        if (n == 0) {        // base case
            return 1;
        }
        return n * recursiveFactorial(n - 1); // recursive call
    }

    static boolean isPalindrome(String str, int start, int end) {
        // Base case: if start >= end, all characters matched
        if (start >= end) {
            return true;
        }

        // Check first and last characters
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call for inner substring
        return isPalindrome(str, start + 1, end - 1);
    }

    static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;   // base case
        }
        return fib(n - 1) + fib(n - 2); // recursive case
    }

    static void listFiles(File file) {
        if (file.isFile()) {// base case
            System.out.println(file.getName());
        } else if (file.isDirectory()) {
            System.out.println("Directory: " + file.getName());
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    listFiles(f); // recursive call
                }
            }
        }
    }
    // Stack + DFS(depth-first search)

}
