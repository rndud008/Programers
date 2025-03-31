package 입문;

public class 삼각형의완성조건2 {
    // 선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
    //가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
    //삼각형의 두 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다.
    // 나머지 한 변이 될 수 있는 정수의 개수를 return하도록 solution 함수를 완성해주세요.
    public int solution(int[] sides) {
        int answer = 0;
        int max = sides[0] + sides[1];
        int min = Math.abs(sides[0] - sides[1])+1;
        for (int i = min; i < max; i++) {
            answer++;
        }
        return answer;
    }

    public int solution2(int[] sides) {
        int a = sides[0];
        int b = sides[1];
        return (a + b) - Math.abs(a - b) - 1;
    }
}
