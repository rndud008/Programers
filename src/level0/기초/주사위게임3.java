package level0.기초;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class 주사위게임3 {
    // 1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다.
    // 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
    //
    // 네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.

    // 세 주사위에서 나온 숫자가 p로 같고
    // 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.

    // 주사위가 두 개씩 같은 값이 나오고,
    // 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.

    // 어느 두 주사위에서 나온 숫자가 p로 같고
    // 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.

    // 네 주사위에 적힌 숫자가 모두 다르다면
    // 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.

    // 네 주사위를 굴렸을 때 나온 숫자가
    // 정수 매개변수 a, b, c, d로 주어질 때,
    // 얻는 점수를 return 하는 solution 함수를 작성해 주세요.

    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(a,map.getOrDefault(a,0)+1);
        map.put(b,map.getOrDefault(b,0)+1);
        map.put(c,map.getOrDefault(c,0)+1);
        map.put(d,map.getOrDefault(d,0)+1);
        
        if (map.keySet().size() == 4){
            return map.keySet().stream().mapToInt(i -> i).min().getAsInt();
        } else if (map.keySet().size() == 3) {
            return map.keySet().stream().filter(i -> map.get(i) == 1).reduce((e,f) -> e * f).orElse(0);
        } else if (map.keySet().size() == 2) {
            if (map.keySet().stream().filter(i -> map.get(i) ==3).findFirst().orElse(0) != 0){
                int max = map.keySet().stream().filter(i -> map.get(i) ==3).findFirst().orElse(0);
                int min = map.keySet().stream().filter(i -> map.get(i) == 1).findFirst().orElse(0);

                return ((10 * max )+ min) * ((10 * max )+ min);
            }
            int sum = map.keySet().stream().mapToInt(i -> i).sum();
            int minus = map.keySet().stream().mapToInt(i -> i).reduce((e,f) -> e-f).getAsInt();
            return Math.abs(sum * minus);
        } else if (map.keySet().size() ==1 ) {
            return 1111 * a;
        }

        return answer;

    }

    public int solution2(int a, int b, int c, int d) {
        List<Integer> dice = List.of(a, b, c, d);

        Map<Integer, Long> freqMap = dice.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        List<Integer> keys = new ArrayList<>(freqMap.keySet());

        switch (freqMap.size()) {
            case 1:
                return 1111 * keys.get(0);

            case 2:
                if (freqMap.containsValue(3L)) {
                    int p = keys.stream().filter(k -> freqMap.get(k) == 3L).findFirst().get();
                    int q = keys.stream().filter(k -> freqMap.get(k) == 1L).findFirst().get();
                    return (10 * p + q) * (10 * p + q);
                } else {
                    int p = keys.get(0), q = keys.get(1);
                    return (p + q) * Math.abs(p - q);
                }

            case 3:
                List<Integer> singles = keys.stream().filter(k -> freqMap.get(k) == 1L).collect(Collectors.toList());
                return singles.get(0) * singles.get(1);

            case 4:
                return keys.stream().min(Integer::compareTo).get();

            default:
                return 0;
        }
    }

}
