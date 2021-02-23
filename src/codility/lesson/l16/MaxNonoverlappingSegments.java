package codility.lesson.l16;

/**
 * Greedy algorithms - MaxNonoverlappingSegments
 * <p>
 * Detected time complexity: O(N)
 *
 * @author tildev
 * @data 2021. 02. 23.
 */
public class MaxNonoverlappingSegments {
    public int solution(int[] A, int[] B) {
        int result = 0;

        int index = -1;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > index) {
                result++;
                index = B[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 7, 9, 9};
        int[] B = {5, 6, 8, 9, 10};
        System.out.println(new MaxNonoverlappingSegments().solution(A, B));
    }
}
