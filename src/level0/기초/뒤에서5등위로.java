package level0.기초;

import java.util.Arrays;

public class 뒤에서5등위로 {
    // 정수로 이루어진 리스트 num_list가 주어집니다.
    // num_list에서 가장 작은 5개의 수를 제외한 수들을
    // 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];

        Arrays.sort(num_list);
        int count =0;
        for (int value : num_list){
            if (count> 4){
                answer[count-5] = value;
            }
            count++;
        }
        return answer;
    }

    public int[] solution2(int[] num_list) {
        Arrays.sort(num_list);
        int[] answer = new int[num_list.length - 5];
        System.arraycopy(num_list, 5, answer, 0, num_list.length - 5);
        return answer;
    }

    public int[] solution3(int[] num_list) {
        Arrays.sort(num_list);
        int[] answer = Arrays.copyOfRange(num_list, 5, num_list.length);
        return answer;
    }

    public int[] solution4(int[] num_list) {
        return Arrays.stream(num_list)
                .sorted()
                .skip(5)
                .toArray();
    }
}
