package 입문;

import java.util.stream.IntStream;

public class 연속된수의합 {
    // 연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다.
    // 두 정수 num과 total이 주어집니다.
    // 연속된 수 num개를 더한 값이 total이 될 때,
    // 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.

    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int mid = total/ num;
        answer[0] = mid;
        for (int i = 1; i < num; i++) {
            if(num % 2 == 0){
                answer[i] = i % 2 !=0 ? (mid+ i/2 + i%2) : (mid- i/2 );
            }else {
                answer[i] = i % 2 ==0 ? (mid+ i/2) : (mid- i/2 - i%2);
            }

        }
        return IntStream.of(answer).sorted().toArray();
    }

    public int[] solution2(int num, int total) {
        int start = total / num - (num - 1) / 2;
        return IntStream.range(start, start + num).toArray();
    }
}
