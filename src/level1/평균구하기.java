package level1;

import java.util.Arrays;

public class 평균구하기 {
    // 정수를 담고 있는 배열 arr의
    // 평균값을 return하는 함수, solution을 완성해보세요.

    public double solution(int[] arr) {
        double answer = Arrays.stream(arr).sum()/ (double) arr.length;
        return answer;
    }
}
