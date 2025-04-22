package 기초;

import java.util.Map;
import java.util.stream.IntStream;

public class 오5명씩 {
    // 최대 5명씩 탑승가능한 놀이기구를 타기 위해
    // 줄을 서있는 사람들의 이름이 담긴 문자열 리스트 names가 주어질 때,
    // 앞에서 부터 5명씩 묶은 그룹의 가장 앞에 서있는
    // 사람들의 이름을 담은 리스트를 return하도록 solution 함수를 완성해주세요.
    // 마지막 그룹이 5명이 되지 않더라도 가장 앞에 있는 사람의 이름을 포함합니다.

    public String[] solution(String[] names) {
        String[] answer = new String[(int) Math.ceil(names.length / 5.0)];
        for (int i = 0; i < names.length; i++) {
            if (i%5 == 0){
                answer[i/5] = names[i];
            }
        }
        return answer;
    }

    public String[] solution2(String[] names) {
        return IntStream.range(0, names.length)
                .filter(i -> i % 5 == 0)
                .mapToObj(i -> names[i])
                .toArray(String[]::new);
    }

    public String[] solution3(String[] names) {
        int len = (names.length + 4) / 5; // 올림 대신 수식으로
        String[] answer = new String[len];

        for (int i = 0; i < len; i++) {
            answer[i] = names[i * 5];
        }

        return answer;
    }
}
