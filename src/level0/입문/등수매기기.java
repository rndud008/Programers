package level0.입문;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class 등수매기기 {
    // 영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다.
    // 영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때,
    // 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int currentRank =0;
        boolean check = false;
        Map<Integer,Integer> map = new TreeMap<>(Comparator.reverseOrder());
        for(int[] value : score){
            map.put(value[0]+value[1],map.getOrDefault(value[0]+value[1],0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int lastValue= entry.getValue();
            if (entry.getValue() >= 2){
                currentRank += 1;
                check = true;
            }else {
                currentRank += entry.getValue();
            }

            map.put(entry.getKey(),currentRank);
            if (check){
                currentRank += lastValue -1;
                check= false;
            }

        }
        int index =0;
        for(int[] value : score){
           answer[index] = map.get(value[0]+value[1]);
            index++;
        }

        return answer;
    }

    public int[] solution2(int[][] score) {
        int n = score.length;
        int[] answer = new int[n];
        Participant[] participants = new Participant[n];

        // 각 참가자의 인덱스와 두 점수의 합계를 저장
        for (int i = 0; i < n; i++) {
            int sum = score[i][0] + score[i][1];
            participants[i] = new Participant(i, sum);
        }

        // 합계를 기준으로 내림차순 정렬
        Arrays.sort(participants, (a, b) -> b.sum - a.sum);

        int rank = 1;
        answer[participants[0].index] = rank;

        // 정렬된 순서대로 순위를 할당. 동점이면 동일한 등수 부여.
        for (int i = 1; i < n; i++) {
            if (participants[i].sum == participants[i - 1].sum) {
                answer[participants[i].index] = rank;
            } else {
                rank = i + 1;
                answer[participants[i].index] = rank;
            }
        }
        return answer;
    }

    private static class Participant {
        int index;
        int sum;
        Participant(int index, int sum) {
            this.index = index;
            this.sum = sum;
        }
    }
}
