package level0.기초;

public class 정수찾기 {
    // 정수 리스트 num_list와
    // 찾으려는 정수 n이 주어질 때,
    // num_list안에 n이 있으면 1을
    // 없으면 0을 return하도록 solution 함수를 완성해주세요.
    public int solution(int[] num_list, int n) {
        int answer = 0;

        for (int value: num_list){
            if (value == n){
                return 1;
            }
        }

        return answer;
    }

}
