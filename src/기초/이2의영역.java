package 기초;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 이2의영역 {
    // 정수 배열 arr가 주어집니다.
    // 배열 안의 2가 모두 포함된
    // 가장 작은 연속된 부분 배열을
    // return 하는 solution 함수를 완성해 주세요.
    //단, arr에 2가 없는 경우 [-1]을 return 합니다.
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int start = -1, end = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (start == -1) start = i;
                end = i;
            }
        }
        if (start == -1) {
            return new int[]{-1};
        }

        for (int i = start; i <= end; i++) {
            answer.add(arr[i]);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    public int[] solution2(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int start = -1, end = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (start == -1) start = i;
                end = i;
            }
        }
        if (start == -1) {
            return new int[]{-1};
        }



        return Arrays.copyOfRange(arr, start, end + 1);
    }
}
