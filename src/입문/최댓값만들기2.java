package 입문;

import java.util.Arrays;

public class 최댓값만들기2 {
    // 정수 배열 numbers가 매개변수로 주어집니다.
    // numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);
        boolean check = numbers[0]* numbers[1] > numbers[numbers.length-1] * numbers[numbers.length-2];
        if (check){
           return  numbers[0]* numbers[1];
        }

        return numbers[numbers.length-1] * numbers[numbers.length-2];
    }

    public int solution2(int[] numbers) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int num : numbers) {
            // 최대값 2개
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            // 최소값 2개
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        return Math.max(max1 * max2, min1 * min2);
    }
}
