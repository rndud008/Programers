package 입문;

public class 합성수찾기 {
    //약수의 개수가 세 개 이상인 수를 합성수라고 합니다.
    // 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.

    public static int solution(int n) {
        int answer = n;
        int result = 0;
        for (int i = 1; i <= n; i++) {
            int count=0;
            while (answer != 0){
                if (i % answer == 0 ){
                    count++;
                }
                if (count >= 3){
                    result +=1;
                    answer = n;
                    break;
                }
                answer--;
            }
            answer = n;
        }
        return result;
    }

    public static int solution2(int n) {
        int[] divisors = new int[n + 1]; // 각 숫자의 약수 개수 저장
        int result = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) { // i의 배수들은 i를 약수로 가짐
                divisors[j]++;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (divisors[i] >= 3) {
                result++;
            }
        }

        return result;
    }

    public static int solution3(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j * j <= i; j++) { // 제곱근까지 확인
                if (i % j == 0) {
                    count++; // 작은 약수
                    if (j != i / j) count++; // 짝이 되는 약수 (같지 않을 경우 추가)
                }
                if (count >= 3) { // 약수가 3개 이상이면 증가
                    result++;
                    break;
                }
            }
        }
        return result;
    }

}
