package level1;

import java.util.*;
import java.util.ArrayList;
import java.util.ListIterator;

public class 나누어떨어지는숫자배열 {
    // array의 각 element 중
    // divisor로 나누어 떨어지는 값을
    // 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
    // divisor로 나누어 떨어지는 element가
    // 하나도 없다면 배열에 -1을 담아 반환하세요.

    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        for (int value: arr){
            if (value %divisor == 0){
                answer.add(value);
            }
        }
        if (answer.isEmpty()) answer.add(-1);
        answer.sort(null);
        return answer.stream().mapToInt(i -> i).toArray();
    }

    public int[] solution2(int[] arr, int divisor) {
        int[] result = Arrays.stream(arr)
                .filter(n -> n % divisor == 0)
                .sorted()
                .toArray();

        return result.length == 0 ? new int[]{-1} : result;
    }
}
