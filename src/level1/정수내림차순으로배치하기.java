package level1;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class 정수내림차순으로배치하기 {
    // 함수 solution은 정수 n을 매개변수로 입력받습니다.
    // n의 각 자릿수를 큰것부터
    // 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
    // 예를들어 n이 118372면 873211을 리턴하면 됩니다.

    public long solution(long n) {
        long answer = 0;
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < String.valueOf(n).length(); i++) {
            arr.add( String.valueOf(n).charAt(i) - '0');
        }
        arr.sort(Comparator.reverseOrder());
        String v = "";
        for (int value : arr){
            v += value;
        }
        answer = Long.valueOf(v);
        return answer;
    }

    public long solution2(long n) {
        String sorted = String.valueOf(n)
                .chars()
                .mapToObj(c -> (char) c)
                .sorted(Comparator.reverseOrder())
                .map(String::valueOf)
                .collect(Collectors.joining());

        return Long.parseLong(sorted);
    }

    public long solution3(long n) {
        char[] chars = String.valueOf(n).toCharArray();
        Arrays.sort(chars);

        // 내림차순으로 뒤집으면서 문자열 만들기
        StringBuilder sb = new StringBuilder(new String(chars)).reverse();

        return Long.parseLong(sb.toString());
    }
}
