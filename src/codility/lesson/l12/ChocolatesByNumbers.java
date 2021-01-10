package codility.lesson.l12;

import java.util.HashSet;
import java.util.Set;

/**
 * Euclidean algorithm - ChocolatesByNumbers
 * <p>
 * Detected time complexity:
 *
 * @author tildev
 * @data 2021. 01. 10.
 */
public class ChocolatesByNumbers {
    public int solution(int N, int M) {
        
        return 0;
    }

    /**
     * timeout
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
