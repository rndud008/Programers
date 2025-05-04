package level0.기초;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 마지막두원소 {
    // 정수 리스트 num_list가 주어질 때,
    // 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을
    // 마지막 원소가 그전 원소보다 크지 않다면
    // 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.

    public int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list,num_list.length+1);
        answer[num_list.length] = answer[num_list.length-1] > answer[num_list.length-2] ?
                answer[num_list.length-1] - answer[num_list.length-2] : answer[num_list.length-1] *2;

        return answer;
    }

    public int[] solution2(int[] num_list) {
        int last = num_list[num_list.length - 1];
        int secondLast = num_list[num_list.length - 2];

        int next = last > secondLast ? last - secondLast : last * 2;

        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        answer[num_list.length] = next;

        return answer;
    }

    public int[] solution3(int[] num_list) {
        List<Integer> list = new ArrayList<>();
        for (int num : num_list) list.add(num);

        int last = list.get(list.size() - 1);
        int secondLast = list.get(list.size() - 2);
        int next = last > secondLast ? last - secondLast : last * 2;

        list.add(next);

// 다시 배열로 변환
        return list.stream().mapToInt(i -> i).toArray();
    }

    public int[] solution4(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }

        int last = num_list[num_list.length - 1];
        int secondLast = num_list[num_list.length - 2];
        answer[num_list.length] = last > secondLast ? last - secondLast : last * 2;

        return answer;
    }
}
