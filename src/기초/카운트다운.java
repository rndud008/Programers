package 기초;

import java.util.stream.IntStream;

public class 카운트다운 {
    // 정수 start_num와 end_num가 주어질 때,
    // start_num에서 end_num까지
    // 1씩 감소하는 수들을 차례로 담은
    // 리스트를 return하도록 solution 함수를 완성해주세요.

    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num-end_num+1];
        for (int i = start_num; i >= end_num; i--) {
            answer[start_num - i] = i;
        }

        return answer;
    }

    public int[] solution2(int start_num, int end_num) {


        return IntStream.range(0,start_num-end_num+1).boxed().mapToInt(i -> start_num -i).toArray();
    }
}
