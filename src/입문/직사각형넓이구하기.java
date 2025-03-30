package 입문;

import java.util.Arrays;

public class 직사각형넓이구하기 {
    // 2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다.
    // 직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때,
    // 직사각형의 넓이를 return 하도록 solution 함수를 완성해보세요.

    public int solution(int[][] dots) {
        int answer= 0;
        String[] arrStr = new String[2];
        arrStr[0] = "";
        arrStr[1] = "";
        for(int[] value : dots){
            arrStr[0] += value[0] + ",";
            arrStr[1] += value[1] + ",";
        }

        arrStr[0] = arrStr[0].substring(0, arrStr[0].length()-1);
        arrStr[1] = arrStr[1].substring(0, arrStr[1].length()-1);
        int max0 = Arrays.stream(arrStr[0].split(",")).mapToInt(Integer::parseInt).max().getAsInt();
        int min0 = Arrays.stream(arrStr[0].split(",")).mapToInt(Integer::parseInt).min().getAsInt();
        int max1 = Arrays.stream(arrStr[1].split(",")).mapToInt(Integer::parseInt).max().getAsInt();
        int min1 = Arrays.stream(arrStr[1].split(",")).mapToInt(Integer::parseInt).min().getAsInt();

        answer = (max0- min0) * (max1 - min1);
        return answer;
    }

    public int solution2(int[][] dots) {
        int maxX = Arrays.stream(dots).mapToInt(dot -> dot[0]).max().getAsInt();
        int minX = Arrays.stream(dots).mapToInt(dot -> dot[0]).min().getAsInt();
        int maxY = Arrays.stream(dots).mapToInt(dot -> dot[1]).max().getAsInt();
        int minY = Arrays.stream(dots).mapToInt(dot -> dot[1]).min().getAsInt();

        return (maxX - minX) * (maxY - minY);
    }

    public int solution3(int[][] dots) {
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (int[] dot : dots) {
            int x = dot[0];
            int y = dot[1];

            if (x < minX) minX = x;
            if (x > maxX) maxX = x;
            if (y < minY) minY = y;
            if (y > maxY) maxY = y;
        }

        return (maxX - minX) * (maxY - minY);
    }
}
