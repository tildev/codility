package codility.lesson.l15;

import java.util.HashSet;
import java.util.Set;

/**
 * Caterpillar method - AbsDistinct
 * <p>
 * Detected time complexity: O(N) or O(N*log(N))
 *
 * @author tildev
 * @data 2021. 01. 11.
 */
public class AbsDistinct {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            set.add(Math.abs(a));
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] A = {-5, -3, -1, 0, 3, 6};
        System.out.println(new AbsDistinct().solution(A));
    }
}
