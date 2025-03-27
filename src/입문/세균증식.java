package 입문;

public class 세균증식 {
    // 어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
    // 처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.

    public int solution(int n, int t) {
        int answer = 0;

        return (int)(Math.pow(2,t) * n);
    }

    public int solution2(int n, int t) {
        // n << t는 n을 2^t 만큼 곱하는 효과.
        // 비트 연산자
        // ex) 5 << 3 → 5 * 2^3 → 40

        return n << t;
    }
}
