/**
 * ============================================================
 * MAIN CLASS - UseCase1PalindromeApp
 * ============================================================
 *
 * Use Case 4: Application Entry & Welcome Message
 *
 * Description:
 * This class represents the entry point of the
 * Palindrome Checker Management System.
 *
 * At this stage, the application:
 * - Starts execution from the main() method
 * - Displays a welcome message
 * - Shows application version
 *
 * No palindrome logic is implemented yet.
 *
 * The goal is to establish a clear startup flow.
 *
 * @author Abishek JS
 * @version 4.0
 */

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        System.out.println("WELCOME TO PALINDROME CHECKER APP MANAGEMENT SYSTEM");
        System.out.println("version:4.0");
        System.out.println("System instanced successful");
        System.out.println();

        String Palindrome = "racecar";
        char[] chars = Palindrome.toCharArray();

        boolean flag = true;
        int start = 0, end = Palindrome.length()-1;

        while (start < end){
            if(chars[start] != chars[end]){
                flag = false;
                break;
            }
            start ++;
            end --;
        }

        if (flag)  System.out.println("The string " + Palindrome + " is a palindrome.");
        else System.out.println("The string " + Palindrome + " is not a palindrome.");
    }
}