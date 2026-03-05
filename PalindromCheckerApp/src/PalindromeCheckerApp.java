/**
 * MAIN CLASS - PalindromeCheckerApp
 *
 * Use Case 7: Deque Based Optimized Palindrome Checker
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
 * @Version 7.0
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("WELCOME TO PALINDROME CHECKER APP MANAGEMENT SYSTEM");
        System.out.println("Version: 7.0");
        System.out.println("System instantiated successfully");
        System.out.println();

        String input = "refer";

        // Create deque
        Deque<Character> deque = new ArrayDeque<>();

        // Add characters to deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        // Compare first and last characters
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}