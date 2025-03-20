package 입문;

import java.util.*;

public class 소인수분해 {
    // 소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다.
    // 예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다.
    // 따라서 12의 소인수는 2와 3입니다.
    // 자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.

    public int[] solution(int n) {
        int[] answer = {};
        Set<Integer> set = new TreeSet<>();
        int count = 2;
        while(true){

            if (n % count == 0){
                n /= count;
                set.add(count);
                if (n ==1){
                    break;
                }
            }else if (n % count != 0) {
                count++;
            }

        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] solution2(int n) {
        List<Integer> list = new ArrayList<>();
        int count = 2;

        while (n > 1) {
            if (n % count == 0) {
                n /= count;
                if (!list.contains(count)) { // 중복 방지
                    list.add(count);
                }
            } else {
                count++;
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] solution3(int n) {
        List<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[n + 1]; // 특정 소인수가 중복으로 들어가는지 체크
        int count = 2;

        while (n > 1) {
            if (n % count == 0) {
                n /= count;
                if (!visited[count]) { // 중복 제거
                    visited[count] = true;
                    list.add(count);
                }
            } else {
                count++;
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }


    public int[] solution4(int n) {
        List<Integer> list = new ArrayList<>();

        // 2부터 시작하여 n의 제곱근까지만 반복
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i); // 소인수 추가
                while (n % i == 0) {
                    n /= i; // 같은 소인수 반복 제거
                }
            }
        }

        // n이 소수가 된 경우, 마지막 남은 소수 추가
        if (n > 1) {
            list.add(n);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
