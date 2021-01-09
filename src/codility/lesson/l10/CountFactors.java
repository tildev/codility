package codility.lesson.l10;

/**
 * Prime and composite numbers - CountFactors
 * <p>
 * <p>
 * Detected time complexity: O(sqrt(N))
 *
 * @author tildev
 * @data 2021. 01. 09.
 */
public class CountFactors {
    public int solution(int N) {
        if (N == 1) {
            return 1;
        }
        int factorCnt = 1;
        for (int i = 2; i < Math.sqrt(N); i++) {
            if (N % i == 0) {
                factorCnt += 1;
            }
        }
        factorCnt *= 2;
        if (Math.sqrt(N) % 1 == 0) {
            factorCnt += 1;
        }
        return factorCnt;
    }

    public static void main(String[] args) {
        int N = 24;
        System.out.println(new CountFactors().solution(N));
    }
}
