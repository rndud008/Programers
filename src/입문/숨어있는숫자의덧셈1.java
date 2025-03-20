package 입문;

import java.util.Arrays;

public class 숨어있는숫자의덧셈1 {
    //문자열 my_string이 매개변수로 주어집니다.
    // my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.

    public int solution(String my_string) {
        int answer = 0;
        for (char c : my_string.toCharArray()){
            if (Character.isDigit(c)){
                answer += Integer.parseInt(String.valueOf(c));
            }
        }
        return answer;
    }

    public int solution2(String my_string) {
        return my_string.chars()
                .filter(Character::isDigit)  // 숫자인 문자만 필터링
                .map(c -> c - '0')           // 문자 숫자를 실제 숫자로 변환
                .sum();                       // 합산
    }

    public int solution3(String my_string) {
        return Arrays.stream(my_string.replaceAll("[^0-9]", "").split("")) // 숫자만 남김
                .mapToInt(Integer::parseInt)  // 각 문자를 정수로 변환
                .sum();                        // 합산
    }


}
