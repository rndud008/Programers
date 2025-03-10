package 입문;

public class 두수의나눗셈 {
    //정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 solution 함수를 완성해주세요.

    public static int solution(int num1, int num2) {

        // num1 을 num2 로 나누고 몫은 실수형 값이 나와야하니 double 로 캐스팅해주고
        // 그다음 1000을 곱셈하고난뒤 실수타입을 다시 int타입으로 캐스팅 해줘야함
        int answer = (int) (((double) num1 / num2 )*1000);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(1,3));
        System.out.println(solution(4,2));
        System.out.println(solution(1,0));
    }
}
