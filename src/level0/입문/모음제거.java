package level0.입문;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class 모음제거 {
    // 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
    // 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.

    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for (char c : my_string.toCharArray()) {

            if ("aeiou".indexOf(c) < 0) {
                answer.append(c);
            }
        }
        return answer.toString();
    }

    public String solution2(String my_string) {
// 정규 표현식 사용
        return my_string.replaceAll("[aeiou]", "");
    }

    public String solution3(String my_string) {
        Set<Character> vowels = new HashSet<>(List.of('a', 'e', 'i', 'o', 'u'));
        StringBuilder answer = new StringBuilder();
        for (char c : my_string.toCharArray()) {
            if (!vowels.contains(c)) {
                answer.append(c);
            }
        }
        return answer.toString();
    }


}
