package 입문;

import java.util.HashMap;
import java.util.Map;

public class 겹치는선분의길이 {
    // 선분 3개가 평행하게 놓여 있습니다.
    // 세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]] 형태로 들어있는
    // 2차원 배열 lines가 매개변수로 주어질 때,
    // 두 개 이상의 선분이 겹치는 부분의 길이를 return 하도록 solution 함수를 완성해보세요.
    // lines가 [[0, 2], [-3, -1], [-2, 1]]일 때 그림으로 나타내면 다음과 같습니다.
    //선분이 두 개 이상 겹친 곳은 [-2, -1], [0, 1]로 길이 2만큼 겹쳐있습니다.
    public int solution(int[][] lines) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int[] line : lines){
            check(line,map);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >1){
                answer++;
            }
        }

        return answer;
    }
    private static void check(int[] value, Map<Integer,Integer> map){
        for (int i = value[0]+1; i < value[1]; i++) {
            map.put(i, map.getOrDefault(i,0)+1);
        }
    }

    public int solution2(int[][] lines) {
        // 좌표 범위 -100 ~ 100에 대해 충분한 크기의 배열 생성 (여유분 포함)
        int[] diff = new int[205]; // 인덱스 0 ~ 204
        // 모든 선분에 대해 시작과 끝에서의 변화량 기록
        for (int[] line : lines) {
            int start = Math.min(line[0], line[1]);
            int end = Math.max(line[0], line[1]);
            // 문제에서 [시작+1, 끝] 구간을 고려하므로,
            // 시작점에 해당하는 위치는 start+1부터 영향을 미침.
            diff[start + 101]++; // offset: -100 → index 1, 따라서 +101
            diff[end + 101]--;   // end+101 위치에서 감소
        }

        int answer = 0;
        int current = 0;
        // 누적합을 계산하며 겹치는 부분 확인 (1 이상인 경우)
        // 인덱스 1부터 204까지 반복하면 실제 좌표 -100 ~ 100에 대응됨
        for (int i = 0; i < diff.length; i++) {
            current += diff[i];
            // 문제 조건에 맞게 시작점 제외, 필요한 좌표 범위만 체크
            if (current > 1) {
                answer++;
            }
        }
        return answer;
    }

    public int solution3(int[][] lines) {
        int[] counts = new int[201]; // 인덱스 0~200 (좌표 -100 ~ 100)
        for (int[] line : lines) {
            // 문제에서 점을 포함시키는 방식에 주의 (예: 시작점은 제외, 끝점 포함)
            int start = Math.min(line[0], line[1]);
            int end = Math.max(line[0], line[1]);
            // 점을 start+1부터 end까지 (원래 풀이와 동일한 범위)
            for (int i = start + 1; i <= end; i++) {
                counts[i + 100]++; // 배열 인덱스는 0부터 시작하므로 offset 적용
            }
        }
        int answer = 0;
        for (int count : counts) {
            if (count > 1) answer++;
        }
        return answer;
    }

}
