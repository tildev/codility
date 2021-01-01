package codility.lesson.l05;

/**
 * Prefix Sums - CountDiv
 * <p>
 * Detected time complexity: O(1)
 *
 * @author tildev
 * @data 2021. 01. 01.
 */
public class CountDiv {
    public int solution(int A, int B, int K) {
        int cnt = B / K - A / K;
        if (A % K == 0) {
            return cnt + 1;
        }
        return cnt;
    }

    public static void main(String[] args) {
        //int A = 6, B = 11, K = 2;
        int A = 0, B = 0, K = 11;
        System.out.print(new CountDiv().solution(A, B, K));
    }
}
