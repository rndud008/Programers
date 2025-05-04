package level0.기초;

import java.util.stream.IntStream;

public class 이차원배열대각선순회하기 {
    // 2차원 정수 배열 board와 정수 k가 주어집니다.
    // i + j <= k를 만족하는 모든 (i, j)에 대한
    // board[i][j]의 합을 return 하는 solution 함수를 완성해 주세요.

    public int solution(int[][] board, int k) {
        int answer = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i+j <= k){
                    answer += board[i][j];
                }
            }
        }
        return answer;
    }

    public int solution2(int[][] board, int k) {
        int answer = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j <= k -i && j < board[i].length; j++) {
                answer += board[i][j];
            }
        }
        return answer;
    }

    public int solution3(int[][] board, int k) {

        return IntStream.range(0, board.length)
                .map(i -> IntStream.range(0, board[i].length)
                        .filter(j -> i + j <= k)
                        .map(j -> board[i][j])
                        .sum()
                )
                .sum();
    }
}
