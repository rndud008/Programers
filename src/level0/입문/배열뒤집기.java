package level0.입문;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 배열뒤집기 {
    // 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
    // num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.

    public int[] solution(int[] num_list) {
        int[] answer = {};

        return         IntStream.rangeClosed(1, num_list.length)
                .map(index -> num_list[num_list.length - index]).toArray();
    }

    public int[] solution2(int[] num_list) {
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        Collections.reverse(list);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] solution3(int[] num_list) {
        int[] reversed = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            reversed[i] = num_list[num_list.length - 1 - i];
        }
        return reversed;
    }
}
