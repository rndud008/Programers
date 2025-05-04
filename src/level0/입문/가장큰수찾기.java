package level0.입문;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class 가장큰수찾기 {
    // 정수 배열 array가 매개변수로 주어질 때,
    // 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.

    public int[] solution(int[] array) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int max = Arrays.stream(array).max().getAsInt();
        for (int i = 0; i < array.length; i++) {

            if (array[i] == max) {
                list.add(max);
                list.add(i);
                break;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] solution2(int[] array) {
        int max = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }

        return new int[]{max, index};
    }
    public int[] solution3(int[] array) {
        int max = Arrays.stream(array).max().getAsInt();
        int index = IntStream.range(0, array.length)
                .filter(i -> array[i] == max)
                .findFirst()
                .orElse(-1);

        return new int[]{max, index};
    }


}
