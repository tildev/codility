package codility.lesson.l04;

/**
 * Counting Elements - MissingInteger
 * <p>
 * Detected time complexity: O(N) or O(N * log(N))
 *
 * @author tildev
 * @data 2021. 01. 01.
 */
public class MissingInteger {

    public int solution(int[] A) {
        int[] result = new int[A.length + 1];

        for (int a : A) {
            if (a > 0 && a <= A.length) {
                result[a - 1]++;
            }
        }
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 0)
                return i + 1;
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 6, 4, 1, 2};
        //int[] A = {-1, -3};
        //int[] A = {1, 2, 3};
        System.out.print(new MissingInteger().solution(A));

    }
}
