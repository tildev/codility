package codility.lesson.l01;

/**
 * Iterations - BinaryGap
 *
 * @author tildev
 * @data 2020. 12. 30.
 */
public class BinaryGap {

    /**
     * solution
     *
     * @param N
     * @return
     */
    public int solution(int N) {
        String binaryString = Integer.toBinaryString(N);
        int max = 0;
        int impValue = 0;
        for (int i = 1; i < binaryString.length(); i++) {

            if (binaryString.charAt(i) - '0' == 0) {
                impValue++;
            } else {
                if (max < impValue) {
                    max = impValue;
                }
                impValue = 0;
            }

        }
        return max;
    }

    /**
     * solution1
     *
     * @param N
     * @return
     */
    public int solution1(int N) {
        String binaryString = "";

        while (N > 0) {
            binaryString = (N % 2) + binaryString;
            N /= 2;
        }

        int max = 0;
        int impValue = 0;
        for (int i = 1; i < binaryString.length(); i++) {

            if (binaryString.charAt(i) - '0' == 0) {
                impValue++;
            } else {
                if (max < impValue) {
                    max = impValue;
                }
                impValue = 0;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new BinaryGap().solution(1041));
        System.out.println(new BinaryGap().solution1(1041));
    }
}
