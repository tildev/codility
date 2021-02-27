package codility.lesson.l90;

/**
 * Tasks from Indeed Prime 2015 challenge - LongestPassword
 * <p>
 * Detected time complexity:
 *
 * @author tildev
 * @data 2021. 02. 27.
 */
public class LongestPassword {
    private int max = -1;

    public int solution(String S) {
        String[] words = S.split(" ");
        for (String word : words) {
            int digitsCount = 0;
            int lettersCount = 0;
            boolean found = true;

            for (int i = 0; i < word.length(); i++) {
                char character = word.charAt(i);
                if (Character.isDigit(character)) {
                    digitsCount++;
                } else if (Character.isLetter(character)) {
                    lettersCount++;
                } else {
                    found = false;
                    break;
                }
            }

            if (found && digitsCount % 2 == 1 && lettersCount % 2 == 0) {
                max = Math.max(word.length(), max);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        String S = "test 5 a0A pass007 ?xy1";
        System.out.println(new LongestPassword().solution(S));
    }
}
