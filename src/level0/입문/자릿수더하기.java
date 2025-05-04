package level0.입문;

import java.util.Arrays;

public class 자릿수더하기 {
    // 정수 n이 매개변수로 주어질 때
    // n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
    public int solution(int n) {
        int answer = 0;
        String[] strArr = String.valueOf(n).split("");
        for (String str : strArr){
            answer += Integer.parseInt(str);
        }
        return answer;
    }

    public int solution2(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }

    public int solution3(int n) {
        return Arrays.stream(String.valueOf(n).split(""))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
