package 입문;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 문자열정렬하기2 {
    // 영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때,
    // my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
    public String solution(String my_string) {
        String answer = "";
       String[] arrStr =  my_string.toLowerCase().split("");
        Arrays.sort(arrStr);
        StringBuilder sb = new StringBuilder();
        for (String str : arrStr){
            sb.append(str);
        }
        return sb.toString();
    }

    public String solution2(String my_string) {
        char[] chars = my_string.toLowerCase().toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public String solution3(String my_string) {
        return Arrays.stream(my_string.toLowerCase().split(""))
                .sorted()
                .collect(Collectors.joining());
    }
}
