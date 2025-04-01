package 입문;

public class 저주의숫자3 {
    // 3x 마을 사람들은 3을 저주의 숫자라고 생각하기 때문에 3의 배수와 숫자 3을 사용하지 않습니다. 3x 마을 사람들의 숫자는 다음과 같습니다.
    // 정수 n이 매개변수로 주어질 때, n을 3x 마을에서 사용하는 숫자로 바꿔 return하도록 solution 함수를 완성해주세요.
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <=n ; i++) {
            answer++;
            if (answer % 3 == 0){
                answer++;
            }
            while (String.valueOf(answer).contains("3")){
                answer++;
                if (answer % 3 == 0){
                    answer++;
                }
            }
            System.out.println(answer);
        }
        return answer;
    }

    public int solution2(int n) {
        int count = 0;
        int current = 0;

        while (count < n) {
            current++;
            if (current % 3 == 0 || String.valueOf(current).contains("3")) {
                continue;
            }
            count++;
        }

        return current;
    }
}
