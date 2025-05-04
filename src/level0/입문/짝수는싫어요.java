package level0.입문;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class 짝수는싫어요 {
    //정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
    public int[] solution(int n) {
        int[] answer = {};
        String value = "";
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1){
                value += i + ",";
            }
        }

        answer = Arrays.stream(value.split(",")).flatMapToInt(str -> IntStream.of(Integer.parseInt(str))).toArray();
        return answer;
    }

    public static int[] solution2(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i += 2) { // 홀수만 추가
            list.add(i);
        }

        // 리스트를 배열로 변환
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static int[] solution3(int n) {
        int size = (n + 1) / 2; // 홀수 개수 계산
        int[] answer = new int[size];

        for (int i = 0, num = 1; i < size; i++, num += 2) {
            answer[i] = num;
        }

        return answer;
    }

    public static int[] solution4(int n) {
        return IntStream.rangeClosed(1, n)
                .filter(i -> i % 2 == 1) // 홀수 필터링
                .toArray();
    }




}
