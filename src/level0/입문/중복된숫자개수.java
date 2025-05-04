package level0.입문;

import java.util.Arrays;

public class 중복된숫자개수 {
    // 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때,
    // array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.

    public int solution(int[] array, int n) {
        int answer = 0;
        for (int value: array){
            answer+= value == n ? 1 : 0;
        }
        return answer;
    }


    public int solution2(int[] array, int n) {
        int answer = 0;
        for (int value : array) {
            if (value == n) {
                answer++;
            }
        }
        return answer;
    }

    public int solution3(int[] array, int n) {
        return (int) Arrays.stream(array)
                .filter(value -> value == n)
                .count();
    }
}
