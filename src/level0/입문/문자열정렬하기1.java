package level0.입문;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 문자열정렬하기1 {
    // 문자열 my_string이 매개변수로 주어질 때,
    // my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.

    public int[] solution(String my_string) {
        int[] answer = {};
        String[] numbers = my_string.replaceAll("[a-z]","").split("");
        return Arrays.stream(Arrays.stream(numbers).mapToInt(Integer::parseInt).toArray()).sorted().toArray();
    }

    public int[] solution2(String my_string) {
        return my_string.chars()
                .filter(Character::isDigit)  // 숫자인 문자만 필터링
                .map(c -> c - '0')           // 문자 숫자를 실제 숫자로 변환
                .sorted()                     // 정렬
                .toArray();
    }

    public int[] solution3(String my_string) {
        return Arrays.stream(my_string.replaceAll("[^0-9]", "").split("")) // 숫자만 남김
                .mapToInt(Integer::parseInt)  // 문자열을 정수로 변환
                .sorted()                     // 정렬
                .toArray();
    }

    public int[] solution4(String my_string) {
        List<Integer> list = new ArrayList<>();
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                list.add(c - '0'); // 문자 '0' ~ '9' → 숫자로 변환
            }
        }
        return list.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    public int[] solution5(String my_string) {
        StringBuilder sb = new StringBuilder();
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append(c);
            }
        }
        return sb.chars().map(c -> c - '0').sorted().toArray();
    }

    public int[] solution6(String my_string) {
        return my_string.chars()
                .filter(Character::isDigit)
                .mapToObj(c -> c - '0')  // 문자를 숫자로 변환
                .sorted()
                .mapToInt(i -> i)
                .toArray();
    }


}


