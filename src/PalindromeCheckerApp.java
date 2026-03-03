import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "civic";
        System.out.println("Input : " + input);

        Queue<Character> queue = new LinkedList<>();

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }


        boolean isPalindrome = true;


        while (!queue.isEmpty()) {

            char fromQueue = queue.remove();
            char fromStack = stack.pop();

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }


        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}