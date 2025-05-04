package level0.입문;

import java.util.stream.Collectors;

public class 대문자와소문자 {
    // 문자열 my_string이 매개변수로 주어질 때,
    // 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            boolean lowCheck = (int) my_string.charAt(i) >= 97 && (int) my_string.charAt(i) <= 122;
            if (lowCheck){
                answer.append(String.valueOf(my_string.charAt(i)).toUpperCase());
            }else {
                answer.append(String.valueOf(my_string.charAt(i)).toLowerCase());
            }
        }
        return answer.toString();
    }

    public String solution2(String my_string) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (Character.isLowerCase(c)) {
                answer.append(Character.toUpperCase(c));
            } else {
                answer.append(Character.toLowerCase(c));
            }
        }
        return answer.toString();
    }

    public String solution3(String my_string) {
        return my_string.chars()
                .mapToObj(c -> Character.isLowerCase(c)
                        ? Character.toUpperCase((char) c)
                        : Character.toLowerCase((char) c))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
