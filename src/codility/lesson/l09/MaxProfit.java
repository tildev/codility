package codility.lesson.l09;

/**
 * Maximum slice problem - MaxProfit
 * <p>
 * Detected time complexity:
 *
 * @author tildev
 * @data 2021. 01. 08.
 */
public class MaxProfit {
    public int solution(int[] A) {
        if (A.length <= 1) {
            return 0;
        }
        int dailyMaxProfit = 0, totalMaxProfit = 0, minValue = A[0];

        for (int i = 1; i < A.length; i++) {
            dailyMaxProfit = A[i] - minValue;
            if (A[i] < minValue) {
                minValue = A[i];
            }
            totalMaxProfit = Math.max(dailyMaxProfit, totalMaxProfit);
        }
        if (totalMaxProfit < 0) {
            return 0;
        }
        return totalMaxProfit;
    }

    public static void main(String[] args) {
        int[] A = {23171, 21011, 21123, 21366, 21013, 21367};
        System.out.println(new MaxProfit().solution(A));
    }
}
