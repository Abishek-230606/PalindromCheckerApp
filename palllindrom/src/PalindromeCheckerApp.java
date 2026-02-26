/**
 * ============================================================
 * MAIN CLASS - UseCase1PalindromeApp
 * ============================================================
 *
 * Use Case 1: Application Entry & Welcome Message
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
 * @author Oreoz
 * @version 1.0
 */

public class PalindromeCheckerApp {
    public static void main(String[] args){
        String phrase = "Sajani";
        String newphrase = "";
        int i,n;
        n = phrase.length();
        for(i=n-1;i>=0;i--)
        {
            newphrase += phrase.charAt(i);
        }
        System.out.println("the orginal string is : "+phrase);
        System.out.println("the reversed string is : "+newphrase);
    }
}