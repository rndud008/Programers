package level0.입문;

public class 몫구하기 {

    //정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.
    public static int solution(int num1, int num2) {
        //num1 을 num2 로 나눈값
        int answer = num1 / num2;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(2,1));
        System.out.println(solution(1,2));
    }
}
