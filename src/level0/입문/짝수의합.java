package level0.입문;

import java.util.stream.IntStream;

public class 짝수의합 {
    //정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (i%2 == 0){
                answer+= i;
            }
        }
        return answer;
    }

    public int solution2(int n) {
        int answer = 0;

        return IntStream.rangeClosed(1,n).filter(i -> i%2==0).sum();
    }

    public int solution3(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i+=2) {
            answer+= i;
        }
        return answer;
    }

    public int solution4(int n) {
        int m = n / 2; // 짝수 개수
        return m * (m + 1); // 등차수열 합 공식
    }

    public int solution5(int n) {
        return IntStream.iterate(2, i -> i + 2)
                .limit(n / 2)
                .sum();
    }
}
