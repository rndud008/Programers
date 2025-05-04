package level0.입문;

import java.math.BigInteger;

public class 구슬을나누는경우의수 {
    //머쓱이는 구슬을 친구들에게 나누어주려고 합니다.
    // 구슬은 모두 다르게 생겼습니다.
    // 머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때,
    // balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.

    // n! / (n-m)! * m!
    public int solution(int balls, int share) {
        int answer = 0;
        double n = 1;
        int max = Math.max(share,balls-share);
        int idx = 2;

        for (int i = max+1; i <= balls; i++) {
            n *= i;
            if (idx <=balls-max){
                n /= idx;
                idx++;
            }
        }


        return (int)n;

    }
    public BigInteger solution2(int balls, int share) {
        return factorial(balls).divide(factorial(share).multiply(factorial(balls - share)));
    }

    public BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public int solution3(int balls, int share) {
        if (share == 0 || balls == share) return 1;

        long result = 1;
        for (int i = 0; i < share; i++) {
            result = result * (balls - i) / (i + 1);
        }

        return (int) result;
    }
}
