package 입문;

import java.util.Arrays;

public class 숨어있는숫자의덧셈2 {
    // 문자열 my_string이 매개변수로 주어집니다.
    // my_string은 소문자, 대문자, 자연수로만 구성되어있습니다.
    // my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
    public int solution(String my_string) {
        int answer = 0;
        String[] strArr =  my_string.toLowerCase().replaceAll("[a-z]"," ").split(" ");
        for (String str : strArr){
            if (!str.isEmpty()){
                answer += Integer.parseInt(str);
            }

        }
        return answer;
    }
    public int solution2(String my_string) {
        int sum = 0;
        int num = 0;
        boolean inNumber = false;

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
                inNumber = true;
            } else {
                if (inNumber) {
                    sum += num;
                    num = 0;
                    inNumber = false;
                }
            }
        }

        // 마지막 숫자 처리
        if (inNumber) sum += num;

        return sum;
    }
    public int solution3(String my_string) {
        return Arrays.stream(my_string.toLowerCase().replaceAll("[a-z]", " ").split(" "))
                .filter(s -> !s.isEmpty())
                .mapToInt(Integer::parseInt)
                .sum();
    }


}
