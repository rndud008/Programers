package level0.입문;

import java.util.Arrays;
import java.util.List;

public class 평행 {
    // 점 네 개의 좌표를 담은 이차원 배열  dots가 다음과 같이 매개변수로 주어집니다.
    //[[x1, y1], [x2, y2], [x3, y3], [x4, y4]]
    //주어진 네 개의 점을 두 개씩 이었을 때,
    // 두 직선이 평행이 되는 경우가 있으면 1을 없으면 0을 return 하도록 solution 함수를 완성해보세요.
    public int solution(int[][] dots) {
        int answer = 0;
        int[][] values = new int[6][2];
        for (int i = 0; i < dots.length-1; i++) {
            for (int j = i+1; j < dots.length; j++) {
                values[answer][0] =dots[i][0] - dots[j][0];
                values[answer][1]=dots[i][1] - dots[j][1];
                answer++;
            }
        }

        int[][] pairs = {
                {0, 5}, // (0,1) vs (2,3)
                {1, 4}, // (0,2) vs (1,3)
                {2, 3}  // (0,3) vs (1,2)
        };

        for (int[] pair : pairs) {
            int i = pair[0], j = pair[1];
            if (values[i][0] * values[j][1] == values[j][0] * values[i][1]) {
                return 1;
            }
        }
        return 0;
    }

    public int solution2(int[][] dots) {
        // (0,1) vs (2,3)
        if (isParallel(dots[0], dots[1], dots[2], dots[3])) return 1;
        // (0,2) vs (1,3)
        if (isParallel(dots[0], dots[2], dots[1], dots[3])) return 1;
        // (0,3) vs (1,2)
        if (isParallel(dots[0], dots[3], dots[1], dots[2])) return 1;

        return 0;
    }

    private boolean isParallel(int[] a, int[] b, int[] c, int[] d) {
        int dx1 = a[0] - b[0];
        int dy1 = a[1] - b[1];
        int dx2 = c[0] - d[0];
        int dy2 = c[1] - d[1];

        return dx1 * dy2 == dx2 * dy1;
    }

    public int solution3(int[][] dots) {
        int n = dots.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                // i, j 쌍이 첫 번째 선분
                int dx1 = dots[i][0] - dots[j][0];
                int dy1 = dots[i][1] - dots[j][1];

                // 나머지 점들로 두 번째 선분 만들기
                for (int k = 0; k < n - 1; k++) {
                    for (int l = k + 1; l < n; l++) {
                        // 이미 i, j와 겹치는 쌍은 제외
                        if (i == k || i == l || j == k || j == l) continue;

                        int dx2 = dots[k][0] - dots[l][0];
                        int dy2 = dots[k][1] - dots[l][1];

                        // 기울기 비교 → 평행 조건
                        if (dx1 * dy2 == dx2 * dy1) {
                            return 1;
                        }
                    }
                }
            }
        }

        return 0;
    }

}
