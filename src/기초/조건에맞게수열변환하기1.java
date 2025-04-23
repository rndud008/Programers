package 기초;

import java.util.Arrays;

public class 조건에맞게수열변환하기1 {
    // 정수 배열 arr가 주어집니다.
    // arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고,
    // 50보다 작은 홀수라면 2를 곱합니다.
    // 그 결과인 정수 배열을 return 하는 solution 함수를 완성해 주세요.

    public int[] solution(int[] arr) {
        int[] answer = Arrays.copyOf(arr,arr.length);
        for (int i = 0; i < arr.length; i++) {
            if (answer[i] >=50 && answer[i]%2 ==0){
                answer[i] /=2;
            }else if(answer[i] < 50 && answer[i] %2 == 1){
                answer[i] *=2;
            }
        }
        return answer;
    }


}
