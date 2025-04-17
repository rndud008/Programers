package 기초;

import java.util.ArrayList;
import java.util.List;

public class 리스트자르기 {
    // 정수 n과 정수 3개가 담긴 리스트 slicer
    // 그리고 정수 여러 개가 담긴 리스트 num_list가 주어집니다.
    // slicer에 담긴 정수를 차례대로 a, b, c라고 할 때,
    // n에 따라 다음과 같이 num_list를 슬라이싱 하려고 합니다.
    //n = 1 : num_list의 0번 인덱스부터 b번 인덱스까지
    //n = 2 : num_list의 a번 인덱스부터 마지막 인덱스까지
    //n = 3 : num_list의 a번 인덱스부터 b번 인덱스까지
    //n = 4 : num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로
    //올바르게 슬라이싱한 리스트를 return하도록 solution 함수를 완성해주세요.
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> answer = new ArrayList<>();

        int start ,end, slice = 1;
        if (n == 1){
            start = 0;
            end = slicer[1];
        } else if (n == 2) {
            start = slicer[0];
            end = num_list.length-1;
        } else if (n==3) {
            start = slicer[0];
            end = slicer[1];
        } else  {
            start = slicer[0];
            end = slicer[1];
            slice = slicer[2];
        }
        for (int i = start; i <= end; i++) {
            if ((i - start) % slice == 0) {
                answer.add(num_list[i]);
            }
        }

        return answer.stream().mapToInt(i->i).toArray();
    }
}
