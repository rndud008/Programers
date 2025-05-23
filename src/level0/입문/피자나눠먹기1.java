package level0.입문;

import java.util.stream.IntStream;

public class 피자나눠먹기1 {
    //머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다.
    // 피자를 나눠먹을 사람의 수 n이 주어질 때,
    // 모든 사람이 피자를 한 조각 이상 먹기 위해
    // 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.

    public int solution(int n) {
        int answer;
        if (n % 7 == 0) {
            answer = n / 7;
        } else {
            answer = n / 7 + 1;
        }
        return answer;
    }

    public int solution2(int n) {
        int answer;

        return n % 7 == 0 ? n / 7 : n / 7 + 1;
    }

    public int solution3(int n) {
        int answer;

        return (n+6)/7;
    }

    public int solution4(int n) {
        int answer;

        return IntStream.of(n).map(x -> (x+6)/7).findFirst().getAsInt();
    }
}
