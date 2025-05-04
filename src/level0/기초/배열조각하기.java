package level0.기초;

import java.util.Arrays;

public class 배열조각하기 {
    // 정수 배열 arr와 query가 주어집니다.
    // query를 순회하면서 다음 작업을 반복합니다.

    // 짝수 인덱스에서는 arr에서
    // query[i]번 인덱스를 제외하고
    // 배열의 query[i]번 인덱스 뒷부분을 잘라서 버립니다.

    // 홀수 인덱스에서는
    // arr에서 query[i]번 인덱스는 제외하고
    // 배열의 query[i]번 인덱스 앞부분을 잘라서 버립니다.
    // 위 작업을 마친 후 남은 arr의 부분 배열을
    // return 하는 solution 함수를 완성해 주세요.

    public int[] solution(int[] arr, int[] query) {
        int[] answer = Arrays.copyOf(arr,arr.length);
        for (int i = 0; i < query.length; i++) {
            int q = query[i];
            if (i % 2 == 0) {
                // 짝수 인덱스 → query[i] 포함하고 뒷부분 제거
                answer = Arrays.copyOfRange(answer, 0, q + 1);
            } else {
                // 홀수 인덱스 → query[i] 포함하고 앞부분 제거
                answer = Arrays.copyOfRange(answer, q, answer.length);
            }
        }
        return answer;
    }
}
