/**
 * MAIN CLASS - PalindromeCheckerApp
 *
 * Use Case 13: Performance Checker for Palindrome Algorithms
 *
 * Description:
 * This application measures the execution time of different
 * palindrome algorithms using the Strategy Pattern.
 *
 * The application:
 * - Selects a palindrome checking strategy
 * - Executes the algorithm
 * - Measures execution time
 * - Displays the result and performance
 *
 * @Author Abishek JS
 * @Version 13.0
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("WELCOME TO PALINDROME CHECKER APP MANAGEMENT SYSTEM");
        System.out.println("Version: 13.0");
        System.out.println("Performance Checker Initialized");
        System.out.println();

        String input = "madam";

        // Choose algorithm strategy
        PalindromeStrategy strategy = new TwoPointerPalindromeStrategy();
        // PalindromeStrategy strategy = new DequePalindromeStrategy();

        PalindromeService service = new PalindromeService(strategy);

        PerformanceChecker.measurePerformance(service, input);
    }
}

/* Strategy Interface */
interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

/* Strategy 1: Two Pointer Algorithm */
class TwoPointerPalindromeStrategy implements PalindromeStrategy {

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
}

/* Strategy 2: Deque Algorithm */
class DequePalindromeStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String input) {

        input = input.toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {

            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                return false;
            }
        }

        return true;
    }
}

/* Context Class */
class PalindromeService {

    private PalindromeStrategy strategy;

    public PalindromeService(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String input) {
        return strategy.isPalindrome(input);
    }
}

/* Performance Checker Class */
class PerformanceChecker {

    public static void measurePerformance(PalindromeService service, String input) {

        long startTime = System.nanoTime();

        boolean result = service.checkPalindrome(input);

        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        if (result) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        System.out.println("Execution Time: " + executionTime + " nanoseconds");
    }
}