package 입문;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 칠의개수 {
    // 머쓱이는 행운의 숫자 7을 가장 좋아합니다.
    // 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.

    public int solution(int[] array) {
        int answer = 0;

        for (int value : array){
          answer += Arrays.stream(String.valueOf(value).split("")).filter(value2 -> value2.equals("7")).count();
        }
        return answer;
    }

    public int solution2(int[] array) {
        int answer = 0;
        for (int value : array) {
            String str = String.valueOf(value);
            int originalLength = str.length();
            int removedLength = str.replace("7", "").length();
            answer += originalLength - removedLength;
        }
        return answer;
    }

    public int solution3(int[] array) {
        int answer = 0;
        for (int value : array) {
            for (char ch : String.valueOf(value).toCharArray()) {
                if (ch == '7') answer++;
            }
        }
        return answer;
    }

    public int solution4(int[] array) {
        String combined = Arrays.stream(array)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());

        long count = combined.chars()
                .filter(ch -> ch == '7')
                .count();

        return (int) count;
    }


}
