package 기초;

import java.util.Arrays;

public class 뒤에서5등까지 {
    // 정수로 이루어진 리스트 num_list가 주어집니다.
    // num_list에서 가장 작은 5개의 수를 오름차순으로
    // 담은 리스트를 return하도록 solution 함수를 완성해주세요.
    public int[] solution(int[] num_list) {
        int[] answer = {};
        Arrays.sort(num_list);
        answer = Arrays.copyOfRange(num_list,0,5);
        return answer;
    }

}
