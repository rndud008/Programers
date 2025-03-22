package 입문;

import java.util.Arrays;
import java.util.OptionalInt;

public class 삼각형의완성조건1 {

    //선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
    //가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
    //삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다.
    // 세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.

    public int solution(int[] sides) {
        int answer = 0;

        int max = Arrays.stream(sides).max().getAsInt();
        final boolean[] check = {false};
        int result = Arrays.stream(sides).filter(value -> {
            if (value == max && check[0] == false){
                check[0] = true;
                return false;
            }
            return true;
        }).sum();

        return result >= max ? 1 : 2;
    }

    public int solution2(int[] sides) {
        Arrays.sort(sides); // 오름차순 정렬
        return sides[0] + sides[1] > sides[2] ? 1 : 2;
    }

    public int solution3(int[] sides) {
        int sum = Arrays.stream(sides).sum();
        int max = Arrays.stream(sides).max().getAsInt();
        return (sum - max) > max ? 1 : 2;
    }
}
