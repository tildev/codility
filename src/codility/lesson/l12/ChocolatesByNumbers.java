package codility.lesson.l12;

import java.util.HashSet;
import java.util.Set;

/**
 * Euclidean algorithm - ChocolatesByNumbers
 * <p>
 * Detected time complexity: O(log(N + M))
 *
 * @author tildev
 * @data 2021. 01. 10.
 */
public class ChocolatesByNumbers {

    /**
     * 최대 공약수 구하기
     * - 유클리드 호제법(Uclidean algorithm)
     *
     * @param x
     * @param y
     * @return
     */
    public int gcd(int x, int y) {
        if (y == 0) return x; //y가 0이면 x값 반환
        return gcd(y, x % y);
    }

    /**
     * 유클리드 호제법(Uclidean algorithm)
     * <p>
     * Detected time complexity: O(log(N + M))
     *
     * @param N
     * @param M
     * @return
     */
    public int solution(int N, int M) {
        int gcd = gcd(N, M);

        return N / gcd;
    }

    /**
     * fail - timeout
     * <p>
     * Detected time complexity: O(N + M)
     *
     * @param N
     * @param M
     * @return
     */
    public int solution_fail(int N, int M) {
        Set<Integer> set = new HashSet<>();
        int n = 0;
        while (!set.contains(n)) {
            set.add(n);
            n += M;
            if (N <= n) {
                n %= N;
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        int N = 10, M = 4;
        //int N = 15_486_451;
        System.out.println(new ChocolatesByNumbers().solution(N, M));
    }
}
