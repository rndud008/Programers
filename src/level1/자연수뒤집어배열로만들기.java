package level1;

import java.util.*;
import java.util.ArrayList;

public class 자연수뒤집어배열로만들기 {
    // 자연수 n을 뒤집어
    // 각 자리 숫자를 원소로
    // 가지는 배열 형태로 리턴해주세요.
    // 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
    public int[] solution(long n) {
        StringBuilder nValue = new StringBuilder(String.valueOf(n)).reverse();
        int[] answer = new int[nValue.length()];
        for (int i = 0; i < nValue.length(); i++) {
            answer[i] = nValue.charAt(i) -'0';
        }
        return answer;
    }

    public int[] solution2(long n) {
        // 0 처리
        if (n == 0) return new int[]{0};

        List<Long> list = new ArrayList<>();
        while (n > 0) {          // 음수면 Math.abs(n)으로
            list.add(n % 10);    // 맨 끝자리
            n /= 10;
        }
        // List<Integer> → int[]
        return list.stream().mapToInt(Long::intValue).toArray();
    }
}
