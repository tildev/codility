package codility.lesson.l05;

/**
 * Prefix Sums - PassingCars
 * <p>
 * Detected time complexity:
 *
 * @author tildev
 * @data 2021. 01. 01.
 */
public class PassingCars {
    // 0 = east, 1 = west

    /**
     * O(N) 이어야 하므로, 이중 반복문은 불가능.
     * 앞에서 부터 보면 A[] = { 0 1 0 1 1 } 일때,
     * 마주치는 0 값인 A[0]과 1값인 A[1], A[3], A[4] = 3개와
     * 그 다음 0 값은 A[2]과 1값인 A[3], A[4] = 2개 의 경우의 수로 인해서
     * 5개의 결과가 나옴을 알 수 있다.
     * <p>
     * 위의 결과로 봤을 때, 두번째 0인 A[2]값 이전의 1값인 A[1]은 지나간 값으로 치므로, 계산되지 않음을 볼 수 있다.
     * 따라서 뒤에서부터 1 값일때의 경우의 수를 구하고, 0을 만났을 때 그 경우의 수를 누적하는 방식으로 풀이하였다.
     *
     * @param A
     * @return
     */
    public int solution(int[] A) {
        long oneCnt = 0, totalCnt = 0;

        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] == 1) {
                oneCnt++;
            } else if (A[i] == 0) {
                totalCnt += oneCnt;
            }
        }

        if (totalCnt > 1000000000) {
            return -1;
        }
        return (int) totalCnt;
    }

    public static void main(String[] args) {
        int[] A = {0, 1, 0, 1, 1};
        System.out.println(new PassingCars().solution(A));
    }
}
