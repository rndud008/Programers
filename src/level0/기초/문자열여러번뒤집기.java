package level0.기초;

import java.util.Arrays;
import java.util.Comparator;

public class 문자열여러번뒤집기 {
    // 문자열 my_string과 이차원 정수 배열
    // queries가 매개변수로 주어집니다.
    // queries의 원소는 [s, e] 형태로,
    // my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다.
    // my_string에 queries의 명령을 순서대로
    // 처리한 후의 문자열을 return 하는 solution 함수를 작성해 주세요.

    public String solution(String my_string, int[][] queries) {
        String answer = my_string;

        for(int[] query: queries){
            int start = query[0];
            int end = query[1];

            StringBuilder reversed = new StringBuilder(answer.substring(start, end + 1)).reverse();
            String left = answer.substring(0, start);
            String right = answer.substring(end + 1);

            answer = left + reversed + right;
        }
        return answer;
    }
}
