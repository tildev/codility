package codility.lesson.l04;

/**
 * Counting Elements - PermCheck
 * <p>
 * Detected time complexity: O(N) or O(N * log(N))
 *
 * @author tildev
 * @data 2021. 01. 01.
 */
public class PermCheck {
    public int solution(int[] A) {
        boolean[] isPermutationArr = new boolean[A.length];
        for (int a : A) {
            if (a > A.length) {
                return 0;
            }
            isPermutationArr[a - 1] = true;
        }
        for (boolean isPermutation : isPermutationArr) {
            if (!isPermutation) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] A = {4, 1, 3, 2};
        System.out.print(new PermCheck().solution(A));
    }
}
