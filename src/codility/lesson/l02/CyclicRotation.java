package codility.lesson.l02;

/**
 * Arrays - CyclicRotation
 *
 * @author tildev
 * @data 2020. 12. 30.
 */
public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        int arrLength = A.length;
        if (K == 0 || arrLength == 0 || (K % arrLength == 0)) {
            return A;
        }
        K %= arrLength;
        int[] result = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            result[(i + K) % arrLength] = A[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = {3, 8, 9, 7, 6};
        int K = 3;
        int[] resultArr = new CyclicRotation().solution(A, K);
        for (int result : resultArr) {
            System.out.print(result + " ");
        }
    }
}
