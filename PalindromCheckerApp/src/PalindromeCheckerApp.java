/**
 * MAIN CLASS - PalindromeCheckerApp
 *
 * Use Case 11: object-oriented Palindrome Checker
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
 * @Version 11.0
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public boolean isPalindrome(String input) {

        input = input.toLowerCase();

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {

            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println("WELCOME TO PALINDROME CHECKER APP MANAGEMENT SYSTEM");
        System.out.println("Version: 11.0");
        System.out.println("System instantiated successfully");
        System.out.println();

        String input = "madam";

        PalindromeCheckerApp service = new PalindromeCheckerApp();

        boolean result = service.isPalindrome(input);

        if (result) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}