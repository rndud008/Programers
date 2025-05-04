package level0.기초;

import java.util.stream.IntStream;

public class 정사각형으로만들기 {
    // 이차원 정수 배열 arr이 매개변수로 주어집니다.
    // arr의 행의 수가 더 많다면 열의 수가 행의 수와 같아지도록
    // 각 행의 끝에 0을 추가하고,
    // 열의 수가 더 많다면 행의 수가 열의 수와 같아지도록
    // 각 열의 끝에 0을 추가한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.

    public int[][] solution(int[][] arr) {
        int maxLen = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[maxLen][maxLen];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }

    public int[][] solution2(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int maxLen = Math.max(row, col);

        int[][] answer = new int[maxLen][maxLen];

        for (int i = 0; i < row; i++) {
            System.arraycopy(arr[i], 0, answer[i], 0, col);
        }

        return answer;
    }

    public int[][] solution3(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int maxLen = Math.max(row, col);

        int[][] answer = new int[maxLen][maxLen];

        IntStream.range(0, row).forEach(i ->
                IntStream.range(0, col).forEach(j ->
                        answer[i][j] = arr[i][j]
                )
        );

        return answer;
    }
}
