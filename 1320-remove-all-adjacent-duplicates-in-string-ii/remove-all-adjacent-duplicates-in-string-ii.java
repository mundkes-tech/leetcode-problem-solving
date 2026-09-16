import java.util.*;

class Solution {
    public String removeDuplicates(String s, int k) {

        Stack<Character> stack = new Stack<>();
        Stack<Integer> count = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (!stack.isEmpty() && stack.peek() == ch) {
                int c = count.pop() + 1;

                if (c == k) {
                    stack.pop();
                } else {
                    count.push(c);
                }

            } else {
                stack.push(ch);
                count.push(1);
            }
        }

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            char ch = stack.pop();
            int c = count.pop();

            while (c-- > 0) {
                sb.append(ch);
            }
        }

        return sb.reverse().toString();
    }
}