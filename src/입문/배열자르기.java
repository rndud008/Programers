package 입문;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 배열자르기 {
    //정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
    // numbers의 num1번 째 인덱스부터 num2번째 인덱스까지
    // 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.

    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>(Arrays.stream(numbers).boxed().collect(Collectors.toList()));
        List<Integer> addList = new ArrayList<>();
        for (int i = num1; i <= num2 ; i++) {
            addList.add(list.get(i));
        }

        return addList.stream().mapToInt(Integer::intValue).toArray();
    }

    //subList
    public int[] solution2(int[] numbers, int num1, int num2) {

        return Arrays.stream(numbers, num1, num2 + 1).toArray();
    }
    //subList
    public int[] solution3(int[] numbers, int num1, int num2) {
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        return list.subList(num1, num2 + 1).stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] solution4(int[] numbers, int num1, int num2) {
        int[] result = new int[num2 - num1 + 1];
        for (int i = num1; i <= num2; i++) {
            result[i - num1] = numbers[i];
        }
        return result;
    }

    public int[] solution5(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}
