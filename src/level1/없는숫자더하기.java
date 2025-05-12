package level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 없는숫자더하기 {
    // 0부터 9까지의 숫자 중 일부가 들어있는
    // 정수 배열 numbers가 매개변수로 주어집니다.
    // numbers에서 찾을 수 없는 0부터 9까지의 숫자를
    // 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

    public int solution(int[] numbers) {
        Set<Integer> arr = new HashSet<>();
        for (int i = 0; i <= 9; i++) {
            arr.add(i);
        }

        int sum = arr.stream().filter(value -> !Arrays.stream(numbers).filter(n -> n == value).findFirst().isPresent()).mapToInt(i -> i).sum();

        int answer = sum;
        return answer;
    }

    public int solution2(int[] numbers) {
        int total = 45; // 0 + 1 + ... + 9
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return total - sum;
    }

    public int solution3(int[] numbers) {
        boolean[] exists = new boolean[10]; // 0~9

        for (int number : numbers) {
            exists[number] = true;
        }

        int sum = 0;
        for (int i = 0; i <= 9; i++) {
            if (!exists[i]) sum += i;
        }

        return sum;
    }
}
