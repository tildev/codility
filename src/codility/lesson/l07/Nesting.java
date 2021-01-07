package codility.lesson.l07;

import java.util.Stack;

/**
 * Stacks and Queues - Nesting
 * <p>
 * Detected time complexity: O(N)
 *
 * @author tildev
 * @data 2021. 01. 07.
 */
public class Nesting {
    public int solution(String S) {
        int cnt = 0;
        for (char c : S.toCharArray()) {
            if (c == '(') {
                cnt += 1;
            } else {
                if (cnt == 0) {
                    return 0;
                }
                cnt -= 1;
            }
        }
        return cnt == 0 ? 1 : 0;
    }

    public int solution1(String S) {
        Stack<Character> stack = new Stack<>();
        for (Character c : S.toCharArray()) {
            if (c == '(') {
                stack.add(c);
            } else if (c == ')') {
                if (stack.size() > 0 && stack.pop() == '(') {
                    continue;
                } else {
                    return 0;
                }
            }
        }
        if (stack.size() == 0) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        //String S = "(()(())())";
        String S = "())";
        System.out.println(new Nesting().solution(S));
    }
}
