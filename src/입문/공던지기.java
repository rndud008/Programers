package 입문;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class 공던지기 {
    //머쓱이는 친구들과 동그랗게 서서 공 던지기 게임을 하고 있습니다.
    // 공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 그다음 사람에게만 던질 수 있습니다.
    // 친구들의 번호가 들어있는 정수 배열 numbers와 정수 K가 주어질 때,
    // k번째로 공을 던지는 사람의 번호는 무엇인지 return 하도록 solution 함수를 완성해보세요.

    public int solution(int[] numbers, int k) {
        int answer = 0;
        for (int i = 0; i < k-1; i++) {
            if (answer > numbers.length){
                answer-= numbers.length;
            }

            answer+=2;
        }

        if (answer >numbers.length ){
            return numbers[answer- numbers.length];
        }
        return numbers[answer];
    }

    public int solution2(int[] numbers, int k) {

        return numbers[(2 * (k - 1)) % numbers.length];
    }

    public int solution3(int[] numbers, int k) {
        int index = 0;
        for (int i = 1; i < k; i++) { // k-1번 던짐
            index = (index + 2) % numbers.length;
        }
        return numbers[index];
    }
}
