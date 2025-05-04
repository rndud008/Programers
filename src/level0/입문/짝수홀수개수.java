package level0.입문;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class 짝수홀수개수 {

    //정수가 담긴 리스트 num_list가 주어질 때,
    // num_list의 원소 중 짝수와 홀수의 개수를 담은
    // 배열을 return 하도록 solution 함수를 완성해보세요.

    public int[] solution(int[] num_list) {
        int[] answer = {};
        return new int[]{Arrays.stream(num_list).filter(num -> num % 2 == 0).toArray().length
                , Arrays.stream(num_list).filter(num -> num % 2 == 1).toArray().length};
    }

    public int[] solution2(int[] num_list) {
        int evenCount = 0, oddCount = 0;

        for (int num : num_list) {
            if (num % 2 == 0) evenCount++;
            else oddCount++;
        }

        return new int[]{evenCount, oddCount};
    }

    public int[] solution3(int[] num_list) {
        Map<Boolean, Long> countMap = Arrays.stream(num_list)
                .boxed()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0, Collectors.counting()));

        return new int[]{countMap.get(true).intValue(), countMap.get(false).intValue()};
    }

    public int[] solution4(int[] num_list) {
        int[] result = Arrays.stream(num_list)
                .collect(() -> new int[2],
                        (acc, num) -> acc[num % 2]++,
                        (a, b) -> {
                            a[0] += b[0];
                            a[1] += b[1];
                        });

        return result;
    }
}
