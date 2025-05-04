package level0.입문;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 최빈값구하기 {
    //최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
    //정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요.
    // 최빈값이 여러 개면 -1을 return 합니다.

    public int solution(int[] array) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])){
                map.put(array[i],1);
            }else {
                int count = map.get(array[i]) + 1;
                map.put(array[i], count);
            }
        }

        int max = 0;
        for (Integer key : map.keySet()){
            int value = map.get(key);
            if (max == value) {
                answer = -1;
            } else if  (value > max){
                max = value;
                answer = key;
            }
        }

        return answer;
    }

    public static int solution2(int[] array) {
        int[] count = new int[101]; // 숫자 범위가 0~100이면서 작을경우 충분
        int max = 0, answer = -1;
        boolean duplicate = false;

        // 빈도수 계산
        for (int num : array) {
            count[num]++;
            if (count[num] > max) {
                max = count[num];
                answer = num;
                duplicate = false;
            } else if (count[num] == max) {
                duplicate = true;
            }
        }

        return duplicate ? -1 : answer;
    }

    public static int solution3(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        // 빈도수 계산
        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 최빈값 찾기
        int max = 0;
        int answer = -1;
        boolean duplicate = false;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value > max) {
                max = value;
                answer = key;
                duplicate = false; // 새로운 최빈값이 나오면 중복 플래그 초기화
            } else if (value == max) {
                duplicate = true; // 최빈값이 여러 개면 플래그 활성화
            }
        }

        return duplicate ? -1 : answer;
    }

}
