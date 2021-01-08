package codility.lesson.l08;

import java.util.HashMap;
import java.util.Map;

/**
 * Leader - Dominator
 * <p>
 * Detected time complexity:
 *
 * @author tildev
 * @data 2021. 01. 08.
 */
public class Dominator {
    public int solution(int[] A) {
        int maxValue = 0;
        int maxKey = 0;
        Map<Integer, Integer> cntMap = new HashMap<>();
        for (int a : A) {
            cntMap.put(a, cntMap.getOrDefault(a, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : cntMap.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        if (maxValue <= A.length / 2) {
            return -1;
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] == maxKey) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {3, 4, 3, 2, 3, -1, 3, 3};
        System.out.println(new Dominator().solution(A));
    }
}
