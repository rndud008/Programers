package level0.기초;

import java.util.Arrays;

public class 배열의길이에따라다른연산하기 {
    // 정수 배열 arr과 정수 n이 매개변수로 주어집니다.
    // arr의 길이가 홀수라면 arr의 모든 짝수 인덱스 위치에
    // n을 더한 배열을, arr의 길이가 짝수라면
    // arr의 모든 홀수 인덱스 위치에
    // n을 더한 배열을 return 하는 solution 함수를 작성해 주세요.

    public int[] solution(int[] arr, int n) {
        int[] answer = Arrays.copyOf(arr,arr.length);

        for (int i = 0; i < arr.length; i++) {
            if (arr.length % 2 == 0 && i % 2 == 1){
                answer[i] = arr[i] + n;
            } else if (arr.length % 2 == 1 && i % 2 == 0) {
                answer[i] = arr[i] + n;
            }
        }
        return answer;
    }
}
