package level0.기초;

public class n의배수 {
    // 정수 num과 n이 매개 변수로 주어질 때,
    // num이 n의 배수이면 1을 return n의 배수가
    // 아니라면 0을 return하도록 solution 함수를 완성해주세요.
    public int solution(int num, int n) {
        int answer = 0;
        return num % n ==0 ? 1 : 0;
    }

}
