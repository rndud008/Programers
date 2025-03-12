package 입문;

public class 피자나눠먹기2 {
    //머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다.
    // 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때,
    // n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면
    // 최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.

    public int solution(int n) {
        int count = 1;
        while (true) {
            if ((n * count) % 6 == 0) {
                break;
            }
            count++;
        }

        return (n * count) / 6;
    }

    public int solution2(int n) {
        return n / gcd(n, 6);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
