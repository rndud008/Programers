package level0.기초;

import java.util.stream.IntStream;

public class 홀짝에따라다른값반환하기 {
    // 양의 정수 n이 매개변수로 주어질 때,
    // n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고
    // n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.

    public int solution(int n) {
        int answer = 0;
        if (n % 2 == 0){
            for (int i = 0; i <= n; i+=2) {
                answer += (i *i);
            }
        }else {
            for (int i = 1; i <= n; i+=2) {
                answer += i;
            }
        }
        return answer;
    }

    public int solution2(int n) {
        int answer = 0;
        for (int i = (n % 2 == 0 ? 0 : 1); i <= n; i += 2) {
            answer += (n % 2 == 0 ? i * i : i);
        }
        return answer;
    }

    public int solution3(int n) {
        if (n % 2 == 0) {
            int answer = 0;
            for (int i = 0; i <= n; i += 2) {
                answer += i * i;
            }
            return answer;
        } else {
            int k = (n + 1) / 2; // 홀수 개수
            return k * k; // 1 + 3 + 5 + ... + n = k^2
        }
    }
    public int solution4(int n) {
        if (n % 2 == 0) {
            return IntStream.rangeClosed(0, n)
                    .filter(i -> i % 2 == 0)
                    .map(i -> i * i)
                    .sum();
        } else {
            return IntStream.rangeClosed(1, n)
                    .filter(i -> i % 2 != 0)
                    .sum();
        }
    }
}
