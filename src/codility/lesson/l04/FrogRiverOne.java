package codility.lesson.l04;

import java.util.HashSet;
import java.util.Set;

/**
 * Counting Elements - FrogRiverOne
 * <p>
 * Detected time complexity: O(N)
 *
 * @author tildev
 * @data 2020. 12. 31.
 */
public class FrogRiverOne {

    /**
     * solution
     * Detected time complexity: O(N)
     *
     * @param X
     * @param A
     * @return
     */
    public int solution(int X, int[] A) {
        Set<Integer> leaves = new HashSet<>();
        for (int i = 1; i <= X; i++) {
            leaves.add(i);
        }
        int time = -1;
        for (int i = 0; i < A.length; i++) {
            if (leaves.contains(A[i])) {
                leaves.remove(A[i]);
            }
            if (leaves.size() == 0) {
                time = i;
                break;
            }
        }
        return time;
    }

    /**
     * solution1
     * Detected time complexity: O(N)
     *
     * @param X
     * @param A
     * @return
     */
    public int solution1(int X, int[] A) {
        Set<Integer> leaves = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X) {
                leaves.add(A[i]);
            }
            if (leaves.size() == X) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        int X = 5;
        System.out.println(new FrogRiverOne().solution(X, A));
        System.out.println(new FrogRiverOne().solution1(X, A));
    }
}
