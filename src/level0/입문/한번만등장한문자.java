package level0.입문;

import java.util.*;

public class 한번만등장한문자 {
    // 문자열 s가 매개변수로 주어집니다.
    // s에서 한 번만 등장하는 문자를 사전 순으로
    // 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
    // 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
    public String solution(String s) {
        String answer = "";
        String[] arrStr = s.split("");
        Arrays.sort(arrStr);
        Map<String,Integer> map = new TreeMap<>();
        for (String str : arrStr){
            Integer orDefault = map.getOrDefault(str, 0);
            map.put(str, orDefault+1);
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            if (stringIntegerEntry.getValue() == 1){
                answer+= stringIntegerEntry.getKey();
            }
        }

        return answer;
    }

    public String solution2(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Character> uniqueChars = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueChars.add(entry.getKey());
            }
        }

        Collections.sort(uniqueChars);

        StringBuilder sb = new StringBuilder();
        for (char c : uniqueChars) {
            sb.append(c);
        }

        return sb.toString();
    }

    public String solution3(String s) {
        int[] count = new int[26]; // 소문자 알파벳 가정
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (count[i] == 1) {
                sb.append((char)(i + 'a'));
            }
        }

        return sb.toString();
    }
}
