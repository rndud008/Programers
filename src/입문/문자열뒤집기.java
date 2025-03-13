package 입문;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 문자열뒤집기 {
    // 문자열 my_string이 매개변수로 주어집니다.
    // my_string을 거꾸로 뒤집은 문자열을
    // return하도록 solution 함수를 완성해주세요.
    public String solution(String my_string) {
        String answer = "";
        List<String> list = Arrays.stream(my_string.split("")).collect(Collectors.toList());
        Collections.reverse(list);
        return String.join("", list);
    }

    public String solution2(String my_string) {
        return new StringBuilder(my_string).reverse().toString();

    }

    public String solution3(String my_string) {
        char[] chars = my_string.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
        return new String(chars);
    }

    public String solution4(String my_string) {
        return IntStream.range(0, my_string.length())
                .mapToObj(i -> String.valueOf(my_string.charAt(my_string.length() - 1 - i)))
                .collect(Collectors.joining());

    }

    public String solution5(String my_string) {
        return Arrays.stream(my_string.split(""))
                .reduce("", (a, b) -> b + a);

    }



}
