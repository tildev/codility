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

    public static void main(String[] args) {
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(new OddOccurrencesInArray().solution(A));
    }
}
