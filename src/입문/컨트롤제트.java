package 입문;

import java.util.*;

public class 컨트롤제트 {
    // 숫자와 "Z"가 공백으로 구분되어 담긴 문자열이 주어집니다.
    // 문자열에 있는 숫자를 차례대로 더하려고 합니다.
    // 이 때 "Z"가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다.
    // 숫자와 "Z"로 이루어진 문자열 s가 주어질 때, 머쓱이가 구한 값을 return 하도록 solution 함수를 완성해보세요.

    public int solution(String s) {
        int answer = 0;
        String[] strings = s.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals("Z")){
                answer -= Integer.parseInt(strings[i-1]);
            }else {
                answer += Integer.parseInt(strings[i]);
            }

        }
        return answer;
    }

    public int solution2(String s) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (String token : s.split(" ")) {
            if (token.equals("Z") && !deque.isEmpty()) {
                deque.pop(); // 직전 숫자 제거
            } else {
                deque.push(Integer.parseInt(token));
            }
        }
        return deque.stream().mapToInt(Integer::intValue).sum();
    }

    public int solution3(String s) {
        List<Integer> list = new ArrayList<>();
        for (String token : s.split(" ")) {
            if (token.equals("Z") && !list.isEmpty()) {
                list.remove(list.size() - 1); // 마지막 숫자 제거
            } else {
                list.add(Integer.parseInt(token));
            }
        }
        return list.stream().mapToInt(Integer::intValue).sum();
    }

    public int solution4(String s) {
        Deque<Integer> deque = new ArrayDeque<>();
        Arrays.stream(s.split(" "))
                .forEach(token -> {
                    if (token.equals("Z") && !deque.isEmpty()) deque.pollLast();
                    else deque.addLast(Integer.parseInt(token));
                });

        return deque.stream().mapToInt(Integer::intValue).sum();
    }
}
