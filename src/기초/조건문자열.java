package 기초;

import java.util.Map;
import java.util.function.BiPredicate;

public class 조건문자열 {
    // 문자열에 따라 다음과 같이 두 수의 크기를 비교하려고 합니다.
    //두 수가 n과 m이라면
    //">", "=" : n >= m
    //"<", "=" : n <= m
    //">", "!" : n > m
    //"<", "!" : n < m
    //두 문자열 ineq와 eq가 주어집니다.
    // ineq는 "<"와 ">"중 하나고, eq는 "="와 "!"중 하나입니다.
    // 그리고 두 정수 n과 m이 주어질 때,
    // n과 m이 ineq와 eq의 조건에 맞으면 1을 아니면 0을
    // return하도록 solution 함수를 완성해주세요.

    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if (">".equals(ineq) && "=".equals(eq)){
            return n >= m ? 1: 0;
        } else if ("<".equals(ineq) && "=".equals(eq)){
            return n <= m ? 1: 0;
        } else if ("<".equals(ineq) && "!".equals(eq)){
            return n < m ? 1: 0;
        }else if (">".equals(ineq) && "!".equals(eq)){
            return n > m ? 1: 0;
        }

        return 0;
    }

    public int solution2(String ineq, String eq, int n, int m) {
        String op = ineq + eq;

        switch (op) {
            case ">=":
                return n >= m ? 1 : 0;
            case "<=":
                return n <= m ? 1 : 0;
            case "<!":
                return n < m ? 1 : 0;
            case ">!":
                return n > m ? 1 : 0;
        }

        return 0;
    }

    public int solution3(String ineq, String eq, int n, int m) {
        Map<String, BiPredicate<Integer, Integer>> ops = Map.of(
                ">=", (a, b) -> a >= b,
                "<=", (a, b) -> a <= b,
                "<!", (a, b) -> a < b,
                ">!", (a, b) -> a > b
        );

        return ops.get(ineq + eq).test(n, m) ? 1 : 0;
    }

    public int solution4(String ineq, String eq, int n, int m) {
        if (ineq.equals(">")) return eq.equals("=") ? (n >= m ? 1 : 0) : (n > m ? 1 : 0);
        else return eq.equals("=") ? (n <= m ? 1 : 0) : (n < m ? 1 : 0);
    }
}
