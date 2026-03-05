/**
 * MAIN CLASS - PalindromeCheckerApp
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithm
 *
 * Description:
 * Demonstrates Strategy Design Pattern where different
 * palindrome algorithms can be used interchangeably.
 *
 * @Author Abishek JS
 * @Version 12.0
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("WELCOME TO PALINDROME CHECKER APP MANAGEMENT SYSTEM");
        System.out.println("Version: 12.0");
        System.out.println("Strategy Pattern Initialized");
        System.out.println();

        String input = "madam";

        // Choose strategy
        PalindromeStrategy strategy = new TwoPointerPalindromeStrategy();
        // PalindromeStrategy strategy = new DequePalindromeStrategy();

        PalindromeService service = new PalindromeService(strategy);

        boolean result = service.checkPalindrome(input);

        if (result) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
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