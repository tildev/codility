package codility.lesson.l05;

/**
 * Prefix Sums - MinAvgTwoSlice
 * <p>
 * Detected time complexity: O(N)
 *
 * @author tildev
 * @data 2021. 01. 01.
 */
public class MinAvgTwoSlice {

    /**
     * Detected time complexity: O(N)
     * <p>
     * a<=b 일때, a와 b의 평균은 a 이상 / a=b 일때, a와 b의 평균은 a = b 임.
     * (a+b) <= (c+d) 의 경우도 마찬가지로 (a+b)와 (c+d)의 평균은 (a+b) 이상
     * 즉, 원소가 4개 (a, b, c, d) 일 경우, (a+b)와 (c+d)를 나누었을때, 각각의 평균의 작은 값 이상이 되므로
     * 2개인 값만 판별하면 됨.
     * <p>
     * 따라서, 평균내는 값이 3개인 경우와 2개인 경우에서 최소값을 구하면 된다.
     *
     * @param A
     * @return
     */
    public int solution(int[] A) {
        double minAvg = (A[0] + A[1]) / 2d, avg;
        int minIndex = 0;
        for (int i = 2; i < A.length; i++) {
            // 3 num
            avg = (A[i - 2] + A[i - 1] + A[i]) / 3d;
            if (minAvg > avg) {
                minAvg = avg;
                minIndex = i - 2;
            }
            // 2 num
            avg = (A[i - 1] + A[i]) / 2d;
            if (minAvg > avg) {
                minAvg = avg;
                minIndex = i - 1;
            }
        }
        return minIndex;
    }

    /**
     * Detected time complexity: O(N ** 2)
     *
     * @param A
     * @return
     */
    public int solution_fail(int[] A) {
        double minAvg = Integer.MAX_VALUE, avg = 0;
        int minIndex = A.length, sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum = A[i];
            for (int j = i + 1; j < A.length; j++) {
                sum += A[j];
                avg = (double) sum / ((j - i) + 1);
                if (avg < minAvg) {
                    minAvg = avg;
                    minIndex = i;
                }
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[] A = {4, 2, 2, 5, 1, 5, 8};
        System.out.println(new MinAvgTwoSlice().solution(A));
    }
}
