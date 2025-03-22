package 입문;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class 중복된문자제거 {
    // 문자열 my_string이 매개변수로 주어집니다.
    // my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.

    public String solution(String my_string) {
        String answer = "";
        Set<String> set = new HashSet<>();
        for (char c : my_string.toCharArray()){

            if (!set.contains(String.valueOf(c))){
                set.add(String.valueOf(c));
                answer += String.valueOf(c);
            }

        }
        return answer;
    }

    public String solution2(String my_string) {
        Set<Character> seen = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char c : my_string.toCharArray()) {
            if (seen.add(c)) { // add()는 중복이면 false 반환
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public String solution3(String my_string) {
        StringBuilder sb = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        my_string.chars()
                .mapToObj(c -> (char) c)
                .filter(seen::add) // 중복은 false로 필터됨
                .forEach(sb::append);

        return sb.toString();
    }

    public String solution4(String my_string) {
        Set<Character> set = new LinkedHashSet<>();
        for (char c : my_string.toCharArray()) {
            set.add(c); // 알아서 중복 제거 + 순서 유지
        }

        StringBuilder sb = new StringBuilder();
        for (char c : set) {
            sb.append(c);
        }

        return sb.toString();
    }
}
