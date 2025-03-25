package 입문;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class n의배수고르기 {
    // 정수 n과 정수 배열 numlist가 매개변수로 주어질 때,
    // numlist에서 n의 배수가 아닌 수들을 제거한 배열을
    // return하도록 solution 함수를 완성해주세요.

    public int[] solution(int n, int[] numlist) {
        int[] answer = {};

        return    Arrays.stream(numlist).filter(num -> num % n == 0).toArray();
    }

    public int[] solution2(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        for (int num : numlist) {
            if (num % n == 0) {
                list.add(num);
            }
        }
        // List를 배열로 변환
        return list.stream().mapToInt(i -> i).toArray();
    }

    public int[] solution3(int n, int[] numlist) {
        int count = 0;
        for (int num : numlist) {
            if (num % n == 0) count++;
        }

        int[] result = new int[count];
        int idx = 0;
        for (int num : numlist) {
            if (num % n == 0) {
                result[idx++] = num;
            }
        }

        return result;
    }


}
