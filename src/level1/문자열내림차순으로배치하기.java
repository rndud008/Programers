package level1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class 문자열내림차순으로배치하기 {
    // 문자열 s에 나타나는 문자를 큰것부터
    // 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
    // s는 영문 대소문자로만 구성되어 있으며,
    // 대문자는 소문자보다 작은 것으로 간주합니다.
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        answer = Arrays.stream(arr).sorted(Comparator.reverseOrder()).collect(Collectors.joining());


        return answer;
    }

    public String solution2(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        // 배열을 뒤에서부터 읽으면 내림차순
        StringBuilder sb = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}
