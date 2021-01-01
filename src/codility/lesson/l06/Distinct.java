package codility.lesson.l06;

import java.util.HashSet;
import java.util.Set;

/**
 * Sorting - Distinct
 * <p>
 * Detected time complexity: O(N*log(N)) or O(N)
 *
 * @author tildev
 * @data 2021. 01. 02.
 */
public class Distinct {
    public int solution(int[] A) {
        Set<Integer> distinct = new HashSet<>();
        for (int a : A) {
            distinct.add(a);
        }
        return distinct.size();
    }

    public static void main(String[] args) {
        int[] A = {2, 1, 1, 2, 3, 1};
        System.out.println(new Distinct().solution(A));
    }
}
