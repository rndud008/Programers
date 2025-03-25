package 입문;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 문자열안에문자열 {
    // 문자열 str1, str2가 매개변수로 주어집니다.
    // str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요

    public int solution(String str1, String str2) {
        int answer = 0;
        return str1.indexOf(str2) != -1 ? 1 : 2;
    }

    public int solution2(String str1, String str2) {
        int answer = 0;
        return str1.contains(str2) ? 1 : 2;
    }

    public int solution3(String str1, String str2) {
        Pattern pattern = Pattern.compile(Pattern.quote(str2));
        Matcher matcher = pattern.matcher(str1);
        return matcher.find() ? 1 : 2;
    }
}
