package 기초;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 이어붙인수 {
    // 정수가 담긴 리스트 num_list가 주어집니다.
    // num_list의 홀수만 순서대로 이어 붙인 수와
    // 짝수만 순서대로 이어 붙인 수의 합을
    // return하도록 solution 함수를 완성해주세요.

    public int solution(int[] num_list) {
        String even = "";
        String odd = "";
        int answer =0;

        for (int number : num_list){
            even += number % 2 == 0 ? number : "";
            odd += number % 2 == 1 ? number : "";
        }
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        return answer;
    }

    public int solution2(int[] num_list) {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        for (int number : num_list) {
            if (number % 2 == 0) even.append(number);
            else odd.append(number);
        }

        return Integer.parseInt(even.toString()) + Integer.parseInt(odd.toString());
    }

    public int solution3(int[] num_list) {
        String even = Arrays.stream(num_list)
                .filter(n -> n % 2 == 0)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());

        String odd = Arrays.stream(num_list)
                .filter(n -> n % 2 == 1)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());

        return Integer.parseInt(even) + Integer.parseInt(odd);
    }
}
