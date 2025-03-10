package 입문;

public class 두수의곱 {

    //정수 num1, num2가 매개변수 주어집니다. num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요.

    public static int solution(int num1, int num2) {
        // num1 과 num2 를 곱한것
        int answer = num1 * num2;
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution(1,2));
        System.out.println(solution(0,2));
    }
}
