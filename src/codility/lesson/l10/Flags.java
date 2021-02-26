package codility.lesson.l10;

import java.util.ArrayList;
import java.util.List;

/**
 * Prime and composite numbers - Flags
 * <p>
 * Detected time complexity:
 *
 * @author tildev
 * @data 2021. 01. 09.
 */
public class Flags {
    public int solution(int[] A) {
        // peaks 구하기
        List<Integer> peaks = new ArrayList<>();
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i] > A[i - 1] && A[i] < A[i + 1]) {
                peaks.add(i);
            }
        }

        int peakCnt = peaks.size();
        if (peakCnt <= 2) {
            return 2;
        }

        int flags = 1;
        int current = peaks.get(0);
        for (int i = 2; i < peakCnt; i++) {
            for (int j = 1; j < peakCnt; j++) {
                if (flags >= i) {
                    break;
                }
                if (peaks.get(j) - current >= i) {
                    flags += 1;
                    current = peaks.get(j);
                }
            }
            if (flags < i) {
                return i - 1;
            }
        }
        return peakCnt;
    }

    public static void main(String[] args) {
        int[] A = {1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
        System.out.println(new Flags().solution(A));
    }
}
