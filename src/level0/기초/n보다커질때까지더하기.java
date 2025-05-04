package level0.기초;

public class n보다커질때까지더하기 {
    // 정수 배열 numbers와 정수 n이 매개변수로 주어집니다.
    // numbers의 원소를 앞에서부터 하나씩 더하다가
    // 그 합이 n보다 커지는 순간 이때까지
    // 더했던 원소들의 합을 return 하는 solution 함수를 작성해 주세요.
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for (int val : numbers){
            if (answer <=n){
                answer+= val;
            }else {
                return answer;
            }
        }
        return answer;
    }

    public int solution2(int[] numbers, int n) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
            if (sum > n) break;
        }
        return sum;
    }
}
