package 입문;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class 문자열계산하기 {
    // my_string은 "3 + 5"처럼 문자열로 된 수식입니다.
    // 문자열 my_string이 매개변수로 주어질 때,
    // 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.

    public int solution(String my_string) {
        String[] strArr = my_string.split(" ");
        int answer = Integer.parseInt(strArr[0]);
        for (int i = 1; i < strArr.length; i+=2) {

            answer += strArr[i].equals("+") ? Integer.parseInt(strArr[i+1]) : -Integer.parseInt(strArr[i+1]);
        }
        return answer;
    }

    public int solution2(String my_string) {
        String[] strArr = my_string.split(" ");
        int answer = Integer.parseInt(strArr[0]);

        for (int i = 1; i < strArr.length; i += 2) {
            String op = strArr[i];
            int num = Integer.parseInt(strArr[i + 1]);

            if (op.equals("+")) {
                answer += num;
            } else if (op.equals("-")) {
                answer -= num;
            }
        }

        return answer;
    }

    public int solution3(String my_string) {
        String[] tokens = my_string.split(" ");
        return java.util.stream.IntStream.range(0, tokens.length)
                .filter(i -> i % 2 == 0)
                .map(i -> {
                    if (i == 0) return Integer.parseInt(tokens[i]);
                    return tokens[i - 1].equals("+") ? Integer.parseInt(tokens[i]) : -Integer.parseInt(tokens[i]);
                })
                .sum();
    }


    public int solution4(String my_string) {
        String[] strArr = my_string.split(" ");
        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(Integer.parseInt(strArr[0]));

        for (int i = 1; i < strArr.length; i += 2) {
            int num = Integer.parseInt(strArr[i + 1]);
            if (strArr[i].equals("+")) {
                deque.push(num);
            } else {
                deque.push(-num);
            }
        }

        return deque.stream().mapToInt(Integer::intValue).sum();
    }

    public int solution5(String my_string) {
        my_string = my_string.replaceAll("- ", "-").replaceAll("\\+ ", "");
        String[] tokens = my_string.split(" ");

        int sum = 0;
        for (String token : tokens) {
            sum += Integer.parseInt(token);
        }

        return sum;
    }


}
