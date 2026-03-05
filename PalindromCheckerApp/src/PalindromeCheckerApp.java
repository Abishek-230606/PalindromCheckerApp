/**
 * MAIN CLASS - PalindromeCheckerApp
 *
 * Use Case 10: Reccursive Palindrome Checker
 *
 * Description:
 * This class validates whether a string is a palindrome using
 * a Deque (Double Ended Queue) data structure.
 *
 * The application:
 * - Adds characters to a deque
 * - Removes characters from both ends
 * - Compares them
 * - Displays the result
 *
 * @Author Abishek JS
 * @Version 10.0
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class PalindromeCheckerApp {
    public static boolean isPalindrome(String str, int left, int right) {

        // Base case: if pointers cross, it is a palindrome
        if (left >= right) {
            return true;
        }

        // If characters do not match
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, left + 1, right - 1);
    }


    public static void main(String[] args) {

        System.out.println("WELCOME TO PALINDROME CHECKER APP MANAGEMENT SYSTEM");
        System.out.println("Version: 10.0");
        System.out.println("System instantiated successfully");
        System.out.println();

        String input = "madam";

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}