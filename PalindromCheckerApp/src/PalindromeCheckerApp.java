/**
 * MAIN CLASS - PalindromeCheckerApp
 *
 * Use Case 8: Deque Based Optimized Palindrome Checker
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
 * @Version 8.0
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("WELCOME TO PALINDROME CHECKER APP MANAGEMENT SYSTEM");
        System.out.println("Version: 8.0");
        System.out.println("System instantiated successfully");
        System.out.println();

        String input = "refer";

        // Create LinkedList
        LinkedList<Character> list = new LinkedList<>();

        // Add characters to LinkedList
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        // Compare first and last characters
        while (list.size() > 1) {
            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}