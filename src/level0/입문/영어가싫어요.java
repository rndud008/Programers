package level0.입문;

import java.util.HashMap;
import java.util.Map;

public class 영어가싫어요 {

    // 영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
    // 문자열 numbers가 매개변수로 주어질 때,
    // numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.

    public long solution(String numbers) {
        long answer = 0;
        String[] numStr= { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < numStr.length; i++) {
            if (numbers.contains(numStr[i])){
                numbers = numbers.replace(numStr[i], String.valueOf(i));
            }
        }
        return Long.valueOf(numbers);
    }

    public long solution2(String numbers) {
        long answer = 0;
        String[] numStr= { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < numStr.length; i++) {
            numbers = numbers.replaceAll(numStr[i], String.valueOf(i));
        }
        return Long.valueOf(numbers);
    }

    public long solution3(String numbers) {
        Map<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");

        for (String key : map.keySet()) {
            numbers = numbers.replace(key, map.get(key));
        }
        return Long.parseLong(numbers);
    }
}
