package level0.입문;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 암호해독 {
    //군 전략가 머쓱이는 전쟁 중 적군이 다음과 같은 암호 체계를 사용한다는 것을 알아냈습니다.
    //암호화된 문자열 cipher를 주고받습니다.
    //그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.
    //문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 암호 문자열을 return하도록 solution 함수를 완성해주세요.

    public String solution(String cipher, int code) {
        String answer = "";
        for (int i = code-1; i < cipher.length(); i += code) {
            answer += cipher.charAt(i);
        }
        return answer;
    }

    public String solution2(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        for (int i = code-1; i < cipher.length(); i += code) {
            answer.append(cipher.charAt(i)) ;
        }
        return answer.toString();
    }

    public String solution3(String cipher, int code) {
        return IntStream.range(0, cipher.length())
                .filter(i -> (i + 1) % code == 0)
                .mapToObj(i -> String.valueOf(cipher.charAt(i)))
                .collect(Collectors.joining());
    }
}
