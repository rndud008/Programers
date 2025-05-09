package level0.기초;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 부분문자열이어붙여문자열만들기 {
    // 길이가 같은 문자열 배열 my_strings와
    // 이차원 정수 배열 parts가 매개변수로 주어집니다.
    // parts[i]는 [s, e] 형태로, my_string[i]의
    // 인덱스 s부터 인덱스 e까지의 부분 문자열을 의미합니다.
    // 각 my_strings의 원소의 parts에 해당하는
    // 부분 문자열을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.

    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();

        int index = 0;
        for (int[] part : parts){
            int start= part[0];
            int end = part[1];
            answer.append(my_strings[index].substring(start, end+1));

            index++;
        }
        return answer.toString();
    }

    public String solution2(String[] my_strings, int[][] parts) {
        return IntStream.range(0, my_strings.length)
                .mapToObj(i -> my_strings[i].substring(parts[i][0], parts[i][1] + 1))
                .collect(Collectors.joining());
    }

    public String solution3(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();

        IntStream.range(0, my_strings.length).forEach(i -> {
            int start = parts[i][0];
            int end = parts[i][1];
            answer.append(my_strings[i], start, end + 1);
        });

        return answer.toString();
    }
}
