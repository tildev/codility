package codility.lesson.l06;

import java.util.Arrays;

/**
 * Sorting - Triangle
 * <p>
 * Detected time complexity:
 *
 * @author tildev
 * @data 2021. 01. 02.
 */
public class Triangle {
    public int solution(int[] A) {
        Arrays.sort(A);

        for (int i = 0; i < A.length - 2; i++) {
            if (A[i + 2] < (long) A[i + 1] + (long) A[i]) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] A = {10, 2, 5, 1, 8, 20};
        System.out.println(new Triangle().solution(A));
    }
}
