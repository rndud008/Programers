package level0.입문;

public class 팩토리얼 {
    // i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다.
    // 예를들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다.
    // 정수 n이 주어질 때 다음 조건을 만족하는 가장 큰 정수 i를 return 하도록 solution 함수를 완성해주세요.

    public int solution(int n) {
        int answer = 0;

        while (true){
            answer++;
            if (n/answer != 0){
                n/= answer;
            }else {
                break;
            }
        }
        return answer;
    }

    public int solution2(int n) {
        int answer = 0;
        while (n > 1) {
            n /= ++answer;
        }
        return answer;
    }

    public int solution3(int n) {
        int answer = 0;

        while (n / (answer + 1) != 0) { // 나눌 수 있는 동안 반복
            answer++;
            n /= answer;
        }

        return answer;
    }

}
