package codility.lesson.l07;

import java.util.Stack;

/**
 * Stacks and Queues - StoneWall
 * <p>
 * Detected time complexity: O(N)
 *
 * @author tildev
 * @data 2021. 01. 08.
 */
public class StoneWall {
    public int solution(int[] H) {
        Stack<Integer> stack = new Stack<>();
        int blockCnt = 0;
        for (int h : H) {
            while (!stack.isEmpty()) {
                if (stack.peek() > h) {
                    stack.pop();
                    blockCnt++;
                } else if (stack.peek() < h) {
                    stack.push(h);
                    break;
                } else {
                    break;
                }
            }
            if (stack.isEmpty()) {
                stack.push(h);
            }
        }
        return blockCnt + stack.size();
    }

    public static void main(String[] args) {
        int[] H = {8, 8, 5, 7, 9, 8, 7, 4, 8};
        System.out.println(new StoneWall().solution(H));
    }
}
