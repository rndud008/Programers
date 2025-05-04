package level0.기초;

import java.util.stream.Collectors;

public class l로만들기 {
    // 알파벳 소문자로 이루어진 문자열 myString이 주어집니다.
    // 알파벳 순서에서 "l"보다 앞서는 모든 문자를
    // "l"로 바꾼 문자열을 return 하는 solution 함수를 완성해 주세요.

    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();
        for (char c : myString.toCharArray()){

            answer.append(c > 'l' ? c : 'l');

        }
        return answer.toString();
    }

    public String solution2(String myString) {
        String result = myString.chars()
                .mapToObj(c -> (char)c > 'l' ? String.valueOf((char)c) : "l")
                .collect(Collectors.joining());
        return result;
    }

    public String solution3(String myString) {
        char[] chars = myString.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] <= 'l') {
                chars[i] = 'l';
            }
        }
        return new String(chars);
    }

}
