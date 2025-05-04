package level0.입문;

import java.util.*;
import java.util.stream.Collectors;

public class 가까운수 {
    // 정수 배열 array와 정수 n이 매개변수로 주어질 때,
    // array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.

    public int solution(int[] array, int n) {
        List<Integer> list = new ArrayList<>(Arrays.stream(array).boxed().collect(Collectors.toList()));
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.abs(array[i]-n);
        }
        Arrays.sort(array);
        int firstValue = Arrays.stream(array).min().getAsInt();
        final boolean[] check = {false};
        OptionalInt secondOpt = Arrays.stream(array).filter(value -> {
            if (value == firstValue && !check[0]){
                check[0] = true;
                return false;
            }
            return true;
        }).min();

        int secondValue = secondOpt.orElse(-1);

        if (firstValue == secondValue){
            return list.contains(n - firstValue) ? n - firstValue : n + firstValue;
        }

        return list.contains(firstValue + n) ?  n + firstValue: n - firstValue;
    }

    public int solution2(int[] array, int n) {
        return Arrays.stream(array)
                .boxed()
                .min((a, b) -> {
                    int diffA = Math.abs(a - n);
                    int diffB = Math.abs(b - n);
                    if (diffA != diffB) return diffA - diffB;
                    return a - b; // 거리 같으면 더 작은 수 반환
                })
                .get(); // 요소 존재는 보장됨 (array 길이 ≥ 1)
    }

    public int solution3(int[] array, int n) {
        int minDiff = Integer.MAX_VALUE;
        int answer = 0;

        for (int num : array) {
            int diff = Math.abs(num - n);
            if (diff < minDiff || (diff == minDiff && num < answer)) {
                minDiff = diff;
                answer = num;
            }
        }
        return answer;
    }
}
