package codility.lesson.l16;

/**
 * Greedy algorithms - TieRopes
 * <p>
 * Detected time complexity:
 *
 * @author tildev
 * @data 2021. 02. 24.
 */
public class TieRopes {
    public int solution(int K, int[] A) {
        int result = 0, sum = 0;

        for (int a : A) {
            sum += a;
            if (sum >= K) {
                result += 1;
                sum = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int K = 4;
        int[] A = {1, 2, 3, 4, 1, 1, 3};
        System.out.println(new TieRopes().solution(K, A));
    }
}
