package level1;

public class 약수의합 {
    // 정수 n을 입력받아
    // n의 약수를 모두 더한 값을
    // 리턴하는 함수, solution을 완성해주세요.

    public int solution(int n) {
        int answer = 0;
        for (int x = 1; x <= n; x++) {
            if (n % x == 0) {
                answer += x;
            }
        }
        return answer;
    }

    public int solution2(int n) {
        int answer = 0;
        for (int x = 1; x * x <= n; x++) {
            if (n % x == 0) {
                answer += x;           // 작은 약수
                if (x != n / x) {      // 서로 다른 짝 약수라면 추가
                    answer += n / x;
                }
            }
        }
        return answer;
    }
}
