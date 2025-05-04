package level0.입문;

public class 숫자비교하기 {

    //정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.

    public static int solution(int num1, int num2) {
        // num1 과 num2 가 동일하면 1 그렇지 않으면 -1

        if(num1 == num2 ) return 1;

        int answer = -1;

        // 삼항연산자도 사용 가능
        answer = num1 == num2 ? 1 : -1;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(1,2));
        System.out.println(solution(1,1));
    }
}
