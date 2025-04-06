package 입문;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class A로B만들기 {
    public int solution(String before, String after) {
        int answer = 0;
        char[] charArray = before.toCharArray();
        Arrays.sort(charArray);
        before = String.valueOf(charArray);

        charArray =after.toCharArray();
        Arrays.sort(charArray);
        after = String.valueOf(charArray);

        return before.equals(after) ? 1 :0;
    }

    public int solution2(String before, String after) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : before.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : after.toCharArray()) {
            if (!map.containsKey(c)) return 0;
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) map.remove(c);
        }

        return map.isEmpty() ? 1 : 0;
    }
}
