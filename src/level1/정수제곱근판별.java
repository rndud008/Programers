package level1;

public class 정수제곱근판별 {
    // 임의의 양의 정수 n에 대해,
    // n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
    // n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고,
    // n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

    public long solution(long n) {
        double sqrt = Math.floor(Math.sqrt(n));

        long answer = sqrt * sqrt == n ? (long) ((sqrt+1) * (sqrt+1)) : -1;
        return answer;
    }

    public long solution2(long n) {
        double sqrt = Math.sqrt(n);
        if (sqrt == (long) sqrt) {
            long next = (long) sqrt + 1;
            return next * next;
        }
        return -1;
    }


}
