package codility.lesson.l02;

import java.util.HashSet;
import java.util.Set;

/**
 * Arrays - OddOccurrencesInArray
 *
 * @author tildev
 * @data 2020. 12. 30.
 */
public class OddOccurrencesInArray {
    /**
     * solution
     *
     * @param A
     * @return
     */
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            if (set.contains(a)) {
                set.remove(a);
            } else {
                set.add(a);
            }
        }
        return set.iterator().next();
    }

    /**
     * solution1
     * Solve the algorithm using 'XOR' operator
     *
     * @param A
     * @return
     */
    public int solution1(int[] A) {
        int result = 0;
        for (int a : A) {
            result ^= a;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(new OddOccurrencesInArray().solution(A));
        System.out.println(new OddOccurrencesInArray().solution1(A));
    }
}
