package codility.lesson.l06;

import java.util.Arrays;

/**
 * Sorting - MaxProductOfThree
 * <p>
 * Detected time complexity: O(N * log(N))
 *
 * @author tildev
 * @data 2021. 01. 02.
 */
public class MaxProductOfThree {
    /**
     * 마이너스 값이 있을때와 없을때를 비교할 수 있음.
     * 가장 큰 값은 양수값이어야 하므로, 마이너스 값은 무조건 2개만 적용해야 함.
     *
     * @param A
     * @return
     */
    public int solution(int[] A) {
        Arrays.sort(A);
        int aLen = A.length;
        int max = A[aLen - 1] * A[aLen - 2] * A[aLen - 3];
        int maxCaseOfNegative = A[aLen - 1] * A[0] * A[1];
        return max > maxCaseOfNegative ? max : maxCaseOfNegative;
    }

    public static void main(String[] args) {
        int[] A = {-3, 1, 2, -2, 5, 6};
        System.out.println(new MaxProductOfThree().solution(A));
    }
}
