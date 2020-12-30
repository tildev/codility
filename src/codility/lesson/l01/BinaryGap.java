package codility.lesson.l01;

/**
 * BinaryGap
 *
 * @author tildev
 * @data 2020. 12. 30.
 */
public class BinaryGap {
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

    public static void main(String[] args) {
        new BinaryGap().solution(1041);
    }
}
