package level0.입문;

import java.util.Arrays;

public class 이차원으로만들기 {
    //정수 배열 num_list와 정수 n이 매개변수로 주어집니다.
    // num_list를 다음 설명과 같이 2차원 배열로 바꿔 return하도록 solution 함수를 완성해주세요.
    // num_list가 [1, 2, 3, 4, 5, 6, 7, 8] 로 길이가 8이고 n이 2이므로 num_list를 2 * 4 배열로 다음과 같이 변경합니다.
    // 2차원으로 바꿀 때에는 num_list의 원소들을 앞에서부터 n개씩 나눠 2차원 배열로 변경합니다.

    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];

        System.out.println("answer.length = " + answer.length);
        int count = 0;
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[count];
                count++;
            }
        }
        return answer;
    }

    public int[][] solution2(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];

        for (int i = 0; i < answer.length; i++) {
            System.arraycopy(num_list, i * n, answer[i], 0, n);
        }
        return answer;
// System.arraycopy(
// num_list, : 원본 배열 (복사할 데이터가 있는 배열)
// i * n, : num_list에서 복사를 시작할 인덱스 (srcPos)
// answer[i], : 데이터를 복사할 대상 배열 (dest) new int[]
// 0, : answer[i]에서 복사를 시작할 인덱스 (destPos)
// n); :복사할 길이 (원소 개수)

    }


    public int[][] solution3(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = Arrays.copyOfRange(num_list, i * n, (i + 1) * n);
        }

//        원본배열: 복사할 배열 (num_list)
//                시작인덱스: 복사를 시작할 인덱스 (i * n)
//        종료인덱스: 이전 인덱스까지 복사됨 ((i + 1) * n - 1 까지 복사됨)
//        start 부터 복사가 시작됨
//        end 바로 직전 인덱스까지만 복사됨 (end는 포함되지 않음!)
//        end를 제외하는 규칙 덕분에 (i + 1) * n으로 정확한 크기가 복사됨
        return answer;
    }
}
