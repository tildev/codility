package codility.lesson.l09;

/**
 * Maximum slice problem - MaxSliceSum
 * <p>
 * * Kadane’s Algorithm (카데인 알고리즘)
 * <p>
 * Detected time complexity: O(N)
 *
 * @author tildev
 * @data 2021. 01. 09.
 */
public class MaxSliceSum {
    public int solution(int[] A) {
        if (A.length == 1) return A[0];

        int localMaxSum = A[0];
        int globalMaxSum = A[0];

        for (int i = 1; i < A.length; i++) {
            localMaxSum = Math.max(A[i], localMaxSum + A[i]);
            globalMaxSum = Math.max(globalMaxSum, localMaxSum);
        }

        return globalMaxSum;
    }

    public static void main(String[] args) {
        int[] A = {3, 2, -6, 4, 0};
        System.out.println(new MaxSliceSum().solution(A));
    }
}
