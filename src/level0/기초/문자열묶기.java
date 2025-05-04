package level0.기초;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class 문자열묶기 {
    // 문자열 배열 strArr이 주어집니다.
    // strArr의 원소들을 길이가 같은 문자열들끼리
    // 그룹으로 묶었을 때 가장 개수가 많은
    // 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.

    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer, List<String>> collect = Arrays.stream(strArr).collect(Collectors.groupingBy(String::length));
        return collect.values().stream().mapToInt(List::size).max().orElse(0);
    }

    public int solution2(String[] strArr) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (String s : strArr) {
            int len = s.length();
            countMap.put(len, countMap.getOrDefault(len, 0) + 1);
        }

        int max = 0;
        for (int count : countMap.values()) {
            max = Math.max(max, count);
        }

        return max;
    }
}
