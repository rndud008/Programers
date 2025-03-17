package 입문;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 배열회전시키기 {
    // 정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다.
    // 배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.

    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if (direction.equals("right")){
            int firstValue = numbers[numbers.length-1];
            System.arraycopy(numbers, 0, answer, 1, numbers.length-1);
            answer[0] = firstValue;
        }else {
            int lastValue = numbers[0];
            System.arraycopy(numbers, 1, answer, 0, numbers.length-1);
            answer[numbers.length-1] = lastValue;
        }
        return answer;
    }

    public static int[] solution2(int[] numbers, String direction) {
        List<Integer> list = new ArrayList<>();
        for (int num : numbers) list.add(num); // 배열 -> 리스트 변환

        Collections.rotate(list, direction.equals("right") ? 1 : -1); // 회전

        return list.stream().mapToInt(i -> i).toArray(); // 리스트 -> 배열 변환
    }

    public static int[] solution3(int[] numbers, String direction) {
        int len = numbers.length;
        int[] answer = new int[len];

        for (int i = 0; i < len; i++) {
            answer[(i + (direction.equals("right") ? 1 : len - 1)) % len] = numbers[i];
        }
        return answer;
    }
}
