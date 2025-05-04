package level0.기초;

import java.util.Map;
import java.util.function.IntBinaryOperator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 간단한식계산하기 {
    // 문자열 binomial이 매개변수로 주어집니다.
    // binomial은 "a op b" 형태의 이항식이고
    // a와 b는 음이 아닌 정수,
    // op는 '+', '-', '*' 중 하나입니다.
    // 주어진 식을 계산한 정수를 return 하는 solution 함수를 작성해 주세요.

    public int solution(String binomial) {
        String[] p = binomial.trim().split("\\s+");  // 공백 1개 이상
        int a = Integer.parseInt(p[0]);
        int b = Integer.parseInt(p[2]);
        return switch (p[1]) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default  -> throw new IllegalArgumentException("지원하지 않는 연산자: " + p[1]);
        };
    }

    public int solution2(String binomial) {
        String[] tok = binomial.split("\\s*[+\\-*]\\s*"); // 연산자 앞뒤 공백 허용
        Matcher op   = Pattern.compile("[+\\-*]").matcher(binomial);
        if (!op.find()) throw new IllegalArgumentException("연산자 없음");

        int a = Integer.parseInt(tok[0]);
        int b = Integer.parseInt(tok[1]);

        return OP.get(op.group()).applyAsInt(a, b);
    }

    private static final Map<String, IntBinaryOperator> OP =
            Map.of(
                    "+", Integer::sum,
                    "-", (x, y) -> x - y,
                    "*", (x, y) -> x * y
            );
}
