package codility.lesson.l03;

/**
 * Time Complexity - PermMissingElem
 * <p>
 * Detected time complexity:
 *
 * @author tildev
 * @data 2020. 12. 30.
 */
public class PermMissingElem {

    /**
     * solution
     * Detected time complexity: O(N) or O(N * log(N))
     *
     * @param A
     * @return
     */
    public int solution(int[] A) {
        int sum = A.length + 1;
        for (int i = 1; i <= A.length; i++) {
            sum += (i - A[i - 1]);
        }
        return sum;
    }

    /**
     * solution1
     * Detected time complexity: O(N) or O(N * log(N))
     *
     * @param A
     * @return
     */
    public int solution1(int[] A) {
        if (A == null || A.length == 0) {
            return 1;
        }
        long aLen = A.length + 1;
        long sum = (aLen * (aLen + 1) / 2);
        long arrSum = 0;
        for (int i = 0; i < A.length; i++) {
            arrSum += A[i];
        }
        return (int) (sum - arrSum);
    }

    public static void main(String[] args) {
        int[] A = {2, 3, 1, 5};
        System.out.println(new PermMissingElem().solution(A));
        System.out.println(new PermMissingElem().solution1(A));
    }
}
