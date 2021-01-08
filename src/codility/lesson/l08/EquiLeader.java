package codility.lesson.l08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Leader - EquiLeader
 * <p>
 * Detected time complexity: O(N)
 *
 * @author tildev
 * @data 2021. 01. 08.
 */
public class EquiLeader {
    public int solution(int[] A) {
        int dupCnt = 0;
        int leader = 0;
        Map<Integer, Integer> cntMap = new HashMap<>();
        for (int a : A) {
            cntMap.put(a, cntMap.getOrDefault(a, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : cntMap.entrySet()) {
            if (entry.getValue() > dupCnt) {
                dupCnt = entry.getValue();
                leader = entry.getKey();
            }
        }
        // 총 빈도수, index 별 빈도수 구하기
        int leaderCnt = 0;
        List<Integer> leaderIndexCnt = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] == leader) {
                leaderCnt += 1;
            }
            leaderIndexCnt.add(leaderCnt);
        }

        // 계산
        int result = 0, leftCnt, rightCnt;
        float limitLeft, limitRight;
        for (int i = 0; i < A.length; i++) {
            leftCnt = leaderIndexCnt.get(i);
            rightCnt = leaderCnt - leftCnt;

            limitLeft = (i + 2) / 2f;
            limitRight = (A.length - i) / 2f;

            if (leftCnt >= limitLeft && rightCnt >= limitRight) {
                result += 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = {4, 3, 4, 4, 4, 2};
        System.out.println(new EquiLeader().solution(A));
    }
}
