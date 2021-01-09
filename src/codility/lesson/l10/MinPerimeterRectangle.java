package codility.lesson.l10;

/**
 * Prime and composite numbers - MinPerimeterRectangle
 * <p>
 * Detected time complexity: O(sqrt(N))
 *
 * @author tildev
 * @data 2021. 01. 09.
 */
public class MinPerimeterRectangle {
    public int solution(int N) {
        int min = 1 + N;
        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                min = Math.min(min, (N / i + i));
            }
        }
        return min * 2;
    }

    public static void main(String[] args) {
        int N = 30;
        //int N = 15_486_451;
        System.out.println(new MinPerimeterRectangle().solution(N));
    }
}
