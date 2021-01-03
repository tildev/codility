package codility.lesson.l07;

import java.util.Stack;

/**
 * Stacks and Queues - Fish
 * <p>
 * Detected time complexity: O(N)
 *
 * @author tildev
 * @data 2021. 01. 03.
 */
public class Fish {
    public int solution(int[] A, int[] B) {
        Stack<Integer> downFish = new Stack<>();
        int fishCnt = 0;
        for (int i = 0; i < A.length; i++) {
            if (B[i] == 0) {
                if (downFish.isEmpty()) {
                    fishCnt++;
                } else {
                    while (!downFish.isEmpty()) {
                        if (downFish.peek() < A[i]) {
                            downFish.pop();
                        } else {
                            break;
                        }
                    }
                    if (downFish.isEmpty()) {
                        fishCnt++;
                    }
                }
            } else {
                downFish.add(A[i]);
            }
        }
        return fishCnt + downFish.size();
    }

    public static void main(String[] args) {
        int[] A = {4, 3, 2, 1, 5}, B = {0, 1, 0, 0, 0};
        System.out.println(new Fish().solution(A, B));
    }
}
