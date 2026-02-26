/** MAIN CLASS - UseCase5PalindromeCheckerApp

Use Case 6: Stack and queue Based Palindrome Checker

* Description:
        * This class validates a palindrome using a Stack
* data structure which follows the LIFO principle.

* At this stage, the application:
        * - Pushes characters into a stack
* - Pops them in reverse order
* - Compares with original sequence
* - Displays the result

* This maps stack behavior to reversal Logic.

* @Author Abishek JS
* @version 6.0
**/
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        System.out.println("WELCOME TO PALINDROME CHECKER APP MANAGEMENT SYSTEM");
        System.out.println("version:6.0");
        System.out.println("System instanced successful");
        System.out.println();

        String Palindrome = "racecar";
        boolean flag=true;
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for(int i=0;i<Palindrome.length();i++)
        {
            stack.push(Palindrome.charAt(i));
            queue.add(Palindrome.charAt(i));
        }

        for(int i=0;i<Palindrome.length();i++)
        {
            char chs = stack.pop();
            char chq = queue.remove();

            if(Palindrome.charAt(i)!=chs && Palindrome.charAt(i)!=chq)
            {
                flag = false;
            }
        }

        if (flag)  System.out.println("The string " + Palindrome + " is a palindrome.");
        else System.out.println("The string " + Palindrome + " is not a palindrome .");
    }
}