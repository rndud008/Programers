package 입문;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 문자반복출력하기 {
    //문자열 my_string과 정수 n이 매개변수로 주어질 때,
    // my_string에 들어있는 각 문자를 n만큼 반복한
    // 문자열을 return 하도록 solution 함수를 완성해보세요.
    public String solution(String my_string, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] strs = my_string.split("");
        for (String str : strs){
            sb.append(str.repeat(n));
        }
        return sb.toString();
    }

    public String solution2(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            sb.append(String.valueOf(my_string.charAt(i)).repeat(n));
        }
        return sb.toString();
    }

    public String solution3(String my_string, int n) {
        return my_string.chars()
                .mapToObj(c -> String.valueOf((char) c).repeat(n))
                .collect(Collectors.joining());
    }

    public String solution4(String my_string, int n) {
        StringJoiner sj = new StringJoiner("");
        for (char c : my_string.toCharArray()) {
            sj.add(String.valueOf(c).repeat(n));
        }
        return sj.toString();
    }





}
