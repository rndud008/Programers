package 기초;

import java.util.stream.IntStream;

public class 등차수열의특정한항만더하기 {
    // 두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다.
    // 첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때,
    // 이 등차수열의 1항부터 n항까지 included가
    // true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.

    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int index = 0;
        for (boolean include : included){
            answer += include ? ( a + (d * index)) : 0;
            index++;
        }
        return answer;
    }

    public int solution2(int a, int d, boolean[] included) {

        return  IntStream.range(0, included.length)
                .filter(i -> included[i])
                .map(i -> a + d * i)
                .sum();
    }
    public int solution3(int a, int d, boolean[] included) {

        int answer = 0;
        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                answer += a + d * i;
            }
        }
        return answer;
    }
}
