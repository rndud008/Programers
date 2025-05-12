package level1;

public class 하샤드수 {
    // 양의 정수 x가 하샤드 수이려면
    // x의 자릿수의 합으로 x가 나누어져야 합니다.
    // 예를 들어 18의 자릿수 합은 1+8=9이고,
    // 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
    // 자연수 x를 입력받아
    // x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

    public boolean solution(int x) {
        int sum = String.valueOf(x).chars().map(c -> c - '0').sum();
        boolean answer = x%sum == 0;


        return answer;
    }

    public boolean solution2(int x) {
        int original = x;
        int sum = 0;

        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }

        return original % sum == 0;
    }
}
