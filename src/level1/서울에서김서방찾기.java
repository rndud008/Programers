package level1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 서울에서김서방찾기 {
    // String형 배열 seoul의 element중
    // "Kim"의 위치 x를 찾아,
    // "김서방은 x에 있다"는 String을 반환하는 함수,
    // solution을 완성하세요.
    // seoul에 "Kim"은 오직 한 번만 나타나며
    // 잘못된 값이 입력되는 경우는 없습니다.

    public String solution(String[] seoul) {
        String answer = "김서방은 %d에 있다";
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")){
                answer = String.format(answer, i);
            }
        }

        return answer;
    }

    public String solution2(String[] seoul) {
        int index = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 " + index + "에 있다";
    }

    public String solution3(String[] seoul) {
        int index = IntStream.range(0, seoul.length)
                .filter(i -> "Kim".equals(seoul[i]))
                .findFirst()
                .orElse(-1); // 없을 경우 -1

        return "김서방은 " + index + "에 있다";
    }
}
