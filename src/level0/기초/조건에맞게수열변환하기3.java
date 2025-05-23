package level0.기초;

import java.util.Arrays;

public class 조건에맞게수열변환하기3 {
    // 정수 배열 arr와 자연수 k가 주어집니다.
    // 만약 k가 홀수라면 arr의 모든 원소에 k를 곱하고,
    // k가 짝수라면 arr의 모든 원소에 k를 더합니다.
    // 이러한 변환을 마친 후의 arr를 return 하는 solution 함수를 완성해 주세요.

    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        for (int i = 0; i < answer.length; i++) {
            if (k % 2 == 0){
                answer[i] = arr[i] + k;
            }else {
                answer[i] = arr[i] * k;
            }
        }
        return answer;
    }

    public int[] solution2(int[] arr, int k) {
        int[] answer = Arrays.stream(arr)
                .map(v -> (k % 2 == 0) ? v + k : v * k)
                .toArray();
        return answer;
    }
}
