package 입문;

public class 두수의차 {

    //정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.
    public static int solution(int num1, int num2) {
        // num1 과 num2를 뺀값
        int answer = num1- num2;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(1,2));
        System.out.println(solution(3,3));
    }
}
