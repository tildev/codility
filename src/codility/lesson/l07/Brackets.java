package codility.lesson.l07;

import java.util.Stack;

/**
 * Stacks and Queues - Brackets
 * <p>
 * Detected time complexity: O(N)
 *
 * @author tildev
 * @data 2021. 01. 02.
 */
public class Brackets {
    public int solution(String S) {
        Stack<Character> stack = new Stack<>();

        char pop;

        for (char s : S.toCharArray()) {
            if (s == '{' || s == '[' || s == '(') {
                stack.add(s);
            } else {
                if (stack.isEmpty()) {
                    return 0;
                }
                pop = stack.pop();
                if (s == '}') {
                    if (pop != '{') {
                        return 0;
                    }
                } else if (s == ']') {
                    if (pop != '[') {
                        return 0;
                    }
                } else if (s == '}') {
                    if (pop != '{') {
                        return 0;
                    }
                }
            }
        }


        if (stack.isEmpty()) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        //String S = "{[()()]}";
        String S = "([)()]";
        System.out.println(new Brackets().solution(S));
    }
}
