package codility.lesson.l05;

/**
 * Prefix Sums - GenomicRangeQuery
 * <p>
 * Detected time complexity: O(N + M)
 *
 * @author tildev
 * @data 2021. 01. 01.
 */
public class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {
        // a = 1, c = 2, g = 3, t = 4
        int[] a = new int[S.length() + 1];
        int[] c = new int[S.length() + 1];
        int[] g = new int[S.length() + 1];

        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case 'A':
                    a[i + 1]++;
                    break;
                case 'C':
                    c[i + 1]++;
                    break;
                case 'G':
                    g[i + 1]++;
                    break;
                default:
                    break;
            }

            a[i + 1] += a[i];
            c[i + 1] += c[i];
            g[i + 1] += g[i];
        }

        int[] min = new int[P.length];

        for (int i = 0; i < P.length; i++) {
            int startIndex = P[i];
            int endIndex = Q[i];

            if (startIndex == endIndex) {
                switch (chars[startIndex]) {
                    case 'A':
                        min[i] = 1;
                        break;
                    case 'C':
                        min[i] = 2;
                        break;
                    case 'G':
                        min[i] = 3;
                        break;
                    default:
                        min[i] = 4;
                        break;
                }
            } else if (a[startIndex] != a[endIndex + 1]) {
                min[i] = 1;
            } else if (c[startIndex] != c[endIndex + 1]) {
                min[i] = 2;
            } else if (g[startIndex] != g[endIndex + 1]) {
                min[i] = 3;
            } else {
                min[i] = 4;
            }
        }
        return min;
    }

    /**
     * timeout
     *
     * @param S
     * @param P
     * @param Q
     * @return
     */
    public int[] solution_fail(String S, int[] P, int[] Q) {
        String newS = "";
        char s;
        for (int i = 0; i < S.length(); i++) {
            s = S.charAt(i);
            if (s == 'A') {
                newS += "1";
            } else if (s == 'C') {
                newS += "2";
            } else if (s == 'G') {
                newS += "3";
            } else if (s == 'T') {
                newS += "4";
            }
        }

        int[] min = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            for (int j = P[i]; j <= Q[i]; j++) {
                int impV = Integer.parseInt(String.valueOf(newS.charAt(j)));
                if (min[i] == 0) {
                    min[i] = impV;
                } else {
                    if (min[i] > impV) {
                        min[i] = impV;
                    }
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        String S = "CAGCCTA";
        int[] P = {2, 5, 0}, Q = {4, 5, 6};
        int[] result = new GenomicRangeQuery().solution(S, P, Q);
        for (int r : result) {
            System.out.print(r + " ");
        }
    }
}
