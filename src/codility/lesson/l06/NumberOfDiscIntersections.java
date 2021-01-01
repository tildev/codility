package codility.lesson.l06;

import java.util.Arrays;


/**
 * @TODO 다시 풀기*********************
 * Sorting - NumberOfDiscIntersections
 * <p>
 * Detected time complexity:
 *
 * @author tildev
 * @data 2021. 01. 02.
 */
public class NumberOfDiscIntersections {
    /**
     * right 를 오름차순으로 정렬하게 되면,
     * 가장 작은 right 를 제외하고, 모든 right 는 자기 자신보다 큰 수임을 알 수 있다.
     * 또한, 두번째 right는 한개의 right 를 제외하고 모두 자신보다 큰 수 이다.
     * 그 다음도 마찬가지이다.
     *
     * @param A
     * @return
     */
    public int solution(int[] A) {
        int[] left = new int[A.length];
        int[] right = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            left[i] = i - A[i];
            right[i] = i + A[i];
        }
        Arrays.sort(left);
        Arrays.sort(right);

        int intersection = 0;
        int j = 0;
        for (int i = 0; i < A.length; i++) {
            while (j < A.length && right[i] >= left[j]) {
                intersection = intersection + j;
                intersection = intersection - i;
                j++;
            }

        }
        if (intersection > 10_000_000)
            return -1;

        return intersection; // number of intersections
    }

    public static void main(String[] args) {
        int[] A = {1, 5, 2, 1, 4, 0};
        System.out.println(new NumberOfDiscIntersections().solution(A));
    }
}
