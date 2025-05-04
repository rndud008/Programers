package level0.입문;

public class 유한소수판별하기 {
    // 소수점 아래 숫자가 계속되지 않고 유한개인 소수를 유한소수라고 합니다.
    // 분수를 소수로 고칠 때 유한소수로 나타낼 수 있는 분수인지 판별하려고 합니다.
    // 유한소수가 되기 위한 분수의 조건은 다음과 같습니다.
    // 기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야 합니다.
    // 두 정수 a와 b가 매개변수로 주어질 때, a/b가 유한소수이면 1을,
    // 무한소수라면 2를 return하도록 solution 함수를 완성해주세요.

    public int solution(int a, int b) {
        int answer = 1;
        int max = Math.max(a,b);
        for (int i = 2; i < max; i++) {
            if (a% i ==0 && b % i ==0){
                answer =i;
            }
        }

        b /= answer; // 분수를 기약분수로 만듦

        // 분모에서 2와 5를 반복해서 제거
        while (b % 2 == 0) {
            b /= 2;
        }
        while (b % 5 == 0) {
            b /= 5;
        }

        // 분모가 1이면 유한소수, 그렇지 않으면 순환소수
        return b == 1 ? 1 : 2;
    }

    public int solution2(int a, int b) {
        int gcd = getGcd(a, b);
        b /= gcd; // 분수를 기약분수로 만듦

        // 분모에서 2와 5를 반복해서 제거
        while (b % 2 == 0) {
            b /= 2;
        }
        while (b % 5 == 0) {
            b /= 5;
        }

        // 분모가 1이면 유한소수, 그렇지 않으면 순환소수
        return b == 1 ? 1 : 2;
    }

    // 유클리드 호제법을 이용한 최대공약수 계산 함수
    private int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGcd(b, a % b);
    }
}
