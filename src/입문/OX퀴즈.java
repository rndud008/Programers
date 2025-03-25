package 입문;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OX퀴즈 {
    // 덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다.
    // 수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.

    public String[] solution(String[] quiz) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        for (int i = 0; i < quiz.length; i++) {
            int total = 0;

            String[] arrStr = quiz[i].trim().split("=");
            if (arrStr[0].contains(" - ")){
                String[] lastValue = arrStr[0].trim().split(" - ");
                total = Integer.parseInt(lastValue[0].trim())  - Integer.parseInt(lastValue[1].trim());
            }else {
                String[] lastValue = arrStr[0].trim().split("\\+");
                total = Integer.parseInt(lastValue[0].trim())  + Integer.parseInt(lastValue[1].trim());
            }
            String value = total == Integer.parseInt(arrStr[1].trim()) ? "O" : "X";
            list.add(value);
        }
        return list.toArray(new String[0]);
    }

    public String[] solution2(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] parts = quiz[i].split(" = ");
            String left = parts[0].trim();
            int expected = Integer.parseInt(parts[1].trim());

            String[] tokens;
            int result = 0;

            if (left.contains("+")) {
                tokens = left.split(" \\+ ");
                result = Integer.parseInt(tokens[0]) + Integer.parseInt(tokens[1]);
            } else if (left.contains("-")) {
                tokens = left.split(" - ");
                result = Integer.parseInt(tokens[0]) - Integer.parseInt(tokens[1]);
            }

            answer[i] = result == expected ? "O" : "X";
        }

        return answer;
    }

    public String[] solution3(String[] quiz) {
        return Arrays.stream(quiz)
                .map(q -> {
                    String[] parts = q.split("=");
                    String expr = parts[0].trim();
                    int expected = Integer.parseInt(parts[1].trim());

                    int result;
                    if (expr.contains(" - ")) {
                        String[] nums = expr.split(" - ");
                        result = Integer.parseInt(nums[0].trim()) - Integer.parseInt(nums[1].trim());
                    } else {
                        String[] nums = expr.split(" \\+ ");
                        result = Integer.parseInt(nums[0].trim()) + Integer.parseInt(nums[1].trim());
                    }

                    return result == expected ? "O" : "X";
                })
                .toArray(String[]::new);
    }
}
