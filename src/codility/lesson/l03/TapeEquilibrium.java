package codility.lesson.l03;

/**
 * Time Complexity - TapeEquilibrium
 * <p>
 * Detected time complexity: O(N)
 *
 * @author tildev
 * @data 2020. 12. 31.
 */
public class TapeEquilibrium {

    public int solution(int[] A) {
        int aLen = A.length;
        long diff, minDiff = Integer.MAX_VALUE;
        long leftSum = 0, rightSum = 0;

        for (int i = 0; i < aLen; i++) {
            rightSum += A[i];
        }

        for (int i = 0; i < aLen - 1; i++) {
            leftSum += A[i];
            rightSum -= A[i];

            diff = Math.abs(leftSum - rightSum);
            if (minDiff > diff) {
                minDiff = diff;
            }
        }

        return (int) minDiff;
    }

    public static void main(String[] args) {
        int[] A = {3, 1, 2, 4, 3};
        System.out.println(new TapeEquilibrium().solution(A));
    }
}
