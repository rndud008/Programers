package 기초;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class 배열의원소만큼추가하기 {
    // 아무 원소도 들어있지 않은 빈 배열 X가 있습니다.
    // 양의 정수 배열 arr가 매개변수로 주어질 때,
    // arr의 앞에서부터 차례대로 원소를 보면서
    // 원소가 a라면 X의 맨 뒤에 a를 a번 추가하는 일을
    // 반복한 뒤의 배열 X를 return 하는 solution 함수를 작성해 주세요.

    public int[] solution(int[] arr) {
        int sum = 0;
        for (int a : arr){
            sum+= a;
        }

        int[] answer = new int[sum];

        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            while (arr[i] != count){
                answer[idx++] = arr[i];
                count++;
            }
        }

        return answer;
    }

    public int[] solution2(int[] arr) {
        return Arrays.stream(arr)
                .flatMap(a -> IntStream.generate(() -> a).limit(a))
                .toArray();
    }

    public int[] solution3(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        int[] answer = new int[sum];
        int idx = 0;

        for (int a : arr) {
            Arrays.fill(answer, idx, idx + a, a);
            idx += a;
        }
        return answer;
    }

    public int[] solution4(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int a : arr) {
            for (int i = 0; i < a; i++) {
                list.add(a);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
