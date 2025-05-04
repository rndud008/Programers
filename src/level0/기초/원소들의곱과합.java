package level0.기초;

import java.util.Arrays;

public class 원소들의곱과합 {
    // 정수가 담긴 리스트 num_list가 주어질 때,
    // 모든 원소들의 곱이 모든 원소들의 합의 제곱보다
    // 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.

    public int solution(int[] num_list) {
        int answer = 1;
        int answer1 = 0;
        for (int number : num_list){
            answer *= number ;
            answer1 += number;
        }
        answer1 *= answer1;

        return answer < answer1 ?1 :0;
    }

    public int solution2(int[] num_list) {
        int product = Arrays.stream(num_list).reduce(1, (a, b) -> a * b);
        int sum = Arrays.stream(num_list).sum();
        int sumSquared = sum * sum;

        return product < sumSquared ? 1 : 0;
    }


}
