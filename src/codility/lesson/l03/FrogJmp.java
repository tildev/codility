package codility.lesson.l03;

/**
 * Time Complexity - FrogJmp
 * <p>
 * Detected time complexity: O(1)
 *
 * @author tildev
 * @data 2020. 12. 30.
 */
public class FrogJmp {
    public int solution(int X, int Y, int D) {
        int diff = Y - X;

        return diff % D == 0 ? (diff / D) : (diff / D) + 1;
    }

    public static void main(String[] args) {
        int X = 10, Y = 85, D = 30;
        System.out.println(new FrogJmp().solution(X, Y, D));
    }
}
