public class Lab1Recursion {
    // Recursive method to reverse a string
    public static String reverseString(String str) {
        // Base case: empty string or single character
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }

        // Recursive call: reverse the substring excluding first character
        return reverseString(str.substring(1)) + str.charAt(0);
    }
    //"abc"
//    reverseString("abc")
//    reverseString("bc") +'a'
//    (reverseString("c")+'b')+'a'
//    'c'+'b'+'a'

    // Recursive method to convert decimal to binary
    public static String toBinary(int n) {
        // Base case
        if (n == 0) {
            return "0";
        }
        if (n == 1) {
            return "1";
        }

        // Recursive call: divide number by 2
        return toBinary(n / 2) + (n % 2);
    }
}
