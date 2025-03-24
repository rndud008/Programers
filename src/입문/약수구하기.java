package 입문;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class 약수구하기 {
    // 정수 n이 매개변수로 주어질 때,
    // n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.

    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if(n % i == 0){
                list.add(i);
            }
        }
        list.sort(null);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] solution2(int n) {
        Set<Integer> set = new TreeSet<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                set.add(i);
                set.add(n / i);
            }
        }

        return set.stream().mapToInt(i -> i).toArray();
    }

    public int[] solution3(int n) {
        return IntStream.rangeClosed(1, n)
                .filter(i -> n % i == 0)
                .toArray();
    }
}
