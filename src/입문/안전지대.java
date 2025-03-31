package 입문;

import java.util.Arrays;

public class 안전지대 {
    // 다음 그림과 같이 지뢰가 있는 지역과 지뢰에 인접한 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.
    //지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재합니다.
    //지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 return하도록 solution 함수를 완성해주세요.
    public int solution(int[][] board) {
        int answer = 0;
        int[] x = {-1, -1, -1, 0, 0, 0 ,1, 1, 1};
        int[] y = {-1, 0, 1, -1, 0, 1, -1, 0, 1};

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1){
                    for (int k = 0; k < x.length; k++) {
                        int ix = i + x[k];
                        int jy = j + y[k];
                        if(ix >= 0 && jy >=0 && ix <board.length && jy < board.length) {
                            board[ix][jy] = board[ix][jy] == 1 ? 1: 2;
                        };
                    }
                }
            }
        }

        for (int[]value : board){
            for (int value2: value){
                if (value2 == 0) answer++;
            }
        }
        return answer;
    }

    public int solution2(int[][] board) {
        int n = board.length;
        int answer = 0;

        int[][] dirs = {
                {-1,-1}, {-1,0}, {-1,1},
                {0,-1},  {0,0},  {0,1},
                {1,-1},  {1,0},  {1,1}
        };

        // 위험지역 표시
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    for (int[] dir : dirs) {
                        int nx = i + dir[0];
                        int ny = j + dir[1];
                        if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                            if (board[nx][ny] == 0) board[nx][ny] = 2;
                        }
                    }
                }
            }
        }

        // 안전지대 카운트
        for (int[] row : board) {
            for (int cell : row) {
                if (cell == 0) answer++;
            }
        }

        return answer;
    }

    public int solution3(int[][] board) {
        int n = board.length;
        int[][] mark = new int[n][n];
        int[][] dirs = {
                {-1,-1}, {-1,0}, {-1,1},
                {0,-1},  {0,0},  {0,1},
                {1,-1},  {1,0},  {1,1}
        };

        // 위험지역 마킹
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    for (int[] d : dirs) {
                        int ni = i + d[0];
                        int nj = j + d[1];
                        if (ni >= 0 && nj >= 0 && ni < n && nj < n) {
                            mark[ni][nj] = 1;
                        }
                    }
                }
            }
        }

        // 안전지역 카운트
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mark[i][j] == 0) answer++;
            }
        }

        return answer;
    }
}
