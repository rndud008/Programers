package 입문;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class 순서쌍의개수 {

    //순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다.
    // 자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 자연수 순서쌍의 개수를 return하도록
    // solution 함수를 완성해주세요.

    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n ; i++) {
            if (n% i == 0){
                answer++;
            }
        }
        return answer;
    }

    public int solution2(int n) {
        int answer = 0;
        for (int i = 1; i * i <= n; i++) { // i를 n의 제곱근까지만 검사
            if (n % i == 0) {
                answer++; // i가 약수일 경우
                if (i != n / i) answer++; // i가 n의 제곱근이 아닐 경우, (n / i)도 약수로 추가
            }
        }
        return answer;
    }

    public int solution3(int n) {
        return (int) IntStream.rangeClosed(1, n)
                .filter(i -> n % i == 0)
                .count();
    }

    public int solution4(int n) {
        Set<Integer> divisors = new TreeSet<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                divisors.add(n / i);
            }
        }
        return divisors.size();
    }
}


