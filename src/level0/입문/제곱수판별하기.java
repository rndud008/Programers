package level0.입문;

public class 제곱수판별하기 {
    // 어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다.
    // 정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.
    public int solution(int n) {
        return Math.sqrt(n) % 1 == 0.0 ? 1 : 2;
    }

    public int solution2(int n) {
        double sqrt = Math.sqrt(n);
        if (Math.floor(sqrt) == sqrt) {
            return 1;
        }
        return 2;
    }

    public int solution3(int n) {

        int sqrtInt = (int) Math.sqrt(n);
        if (sqrtInt * sqrtInt == n) {
            return 1;
        }
        return 2;
    }
}
