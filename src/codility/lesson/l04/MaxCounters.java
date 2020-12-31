package codility.lesson.l04;

/**
 * Counting Elements - MaxCounters
 * <p>
 * Detected time complexity: O(N + M)
 *
 * @author tildev
 * @data 2021. 01. 01.
 */
public class MaxCounters {

    /**
     * solution
     * Detected time complexity: O(N + M)
     *
     * @param N
     * @param A
     * @return
     */
    public int[] solution(int N, int[] A) {
        int maxSum = 0, max = 0;
        int[] resultArr = new int[N];
        for (int a : A) {
            if (1 <= a && a <= N) {
                // 모든 값에 적용 되어야 하는 maxSum 값보다 작으면, maxSum 값이 적용되지 않은 것이다.
                // 이 경우, maxSum 값을 적용 하고, +1 값을 해준다.
                // 그 외의 경우, 현 값에 +1 만 해주면 된다.
                if (resultArr[a - 1] < maxSum) {
                    resultArr[a - 1] = (maxSum + 1);
                } else {
                    resultArr[a - 1] += 1;
                }
                // 현 resultArr 배열 에서의 최대값 max 를 구한다
                if (max < resultArr[a - 1]) {
                    max = resultArr[a - 1];
                }
            } else if (a == N + 1) {
                // 모든 resultArr 에 적용 되어야 하는 maxSum 값으로 적용 시킨다
                maxSum = max;
            }
        }
        // result[i] 가 maxSum 값 미만 이라는 것은, 위에서 해당 index 에 maxSum 값을 반영 해주지 않았음 을 의미(+변화가 없었음)
        // 해당 index 에 maxSum 값을 반영 해주면 된다.
        for (int i = 0; i < resultArr.length; i++) {
            if (resultArr[i] < maxSum) {
                resultArr[i] = maxSum;
            }
        }
        return resultArr;
    }

    /**
     * timeout error
     *
     * @param N
     * @param A
     * @return
     */
    public int[] solution_fail(int N, int[] A) {
        int totalSum = 0;
        int[] resultArr = new int[N];
        for (int a : A) {
            int max = 0;
            if (1 <= a && a <= N) {
                resultArr[a - 1] += 1;
            } else if (a == N + 1) {
                for (int result : resultArr) {
                    if (result > max) {
                        max = result;
                    }
                }
                totalSum += max;
                resultArr = new int[N];
            }
        }
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] += totalSum;
        }
        return resultArr;
    }

    public static void main(String[] args) {
        int N = 5;
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int[] resultArr = new MaxCounters().solution(N, A);

        for (int result : resultArr) {
            System.out.print(result + " ");
        }
    }
}
