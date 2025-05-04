package level0.입문;

import java.util.Arrays;

public class 배열의평균값 {
    //정수 배열 numbers가 매개변수로 주어집니다.
    // numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.

    public double solution(int[] numbers) {
        double answer = 0;
        for (int num : numbers){
            answer+= num;
        }

        return answer/ numbers.length;
    }

    public double solution2(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }

    public double solution3(int[] numbers) {
        return Arrays.stream(numbers).reduce(0,Integer::sum) / (double) numbers.length;
    }


}
