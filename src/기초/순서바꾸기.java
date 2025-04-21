package 기초;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 순서바꾸기 {
    // 정수 리스트 num_list와 정수 n이 주어질 때,
    // num_list를 n 번째 원소 이후의 원소들과
    // n 번째까지의 원소들로 나눠 n 번째 원소 이후의
    // 원소들을 n 번째까지의 원소들 앞에 붙인
    // 리스트를 return하도록 solution 함수를 완성해주세요.

    public int[] solution(int[] num_list, int n) {
        int[] result1 = Arrays.copyOfRange(num_list,n, num_list.length);
        int[] result2 = Arrays.copyOfRange(num_list,0, n);
        int[] answer = new int[num_list.length];

        int index = 0;
        for (int value : result1){
            answer[index] = value;
            index++;
        }

        for (int value : result2){
            answer[index] = value;
            index++;
        }


        return answer;
    }

    public int[] solution2(int[] num_list, int n) {
        int len = num_list.length;
        int[] answer = new int[len];

        System.arraycopy(num_list, n, answer, 0, len - n);
        System.arraycopy(num_list, 0, answer, len - n, n);

        return answer;
    }

    public int[] solution3(int[] num_list, int n) {
        return IntStream.concat(
                Arrays.stream(num_list, n, num_list.length),
                Arrays.stream(num_list, 0, n)
        ).toArray();
    }

    public int[] solution4(int[] num_list, int n) {
        int len = num_list.length;
        int[] answer = new int[len];

        for (int i = 0; i < len; i++) {
            answer[i] = num_list[(i + n) % len];
        }

        return answer;
    }
}
