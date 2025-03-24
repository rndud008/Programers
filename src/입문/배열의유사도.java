package 입문;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 배열의유사도 {
    // 두 배열이 얼마나 유사한지 확인해보려고 합니다.
    // 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.

    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        return (int)Arrays.stream(s1).filter(value -> Arrays.stream(s2).anyMatch(value2 -> value2.equals(value))).count();
    }

    public int solution2(String[] s1, String[] s2) {
        Set<String> set = new HashSet<>(List.of(s2));
        long count = Arrays.stream(s1)
                .filter(set::contains)
                .count();
        return (int) count;
    }
}
