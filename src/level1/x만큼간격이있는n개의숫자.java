package level1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class x만큼간격이있는n개의숫자 {
    // 함수 solution은 정수 x와 자연수 n을 입력 받아,
    // x부터 시작해 x씩 증가하는 숫자를
    // n개 지니는 리스트를 리턴해야 합니다.
    // 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

    public long[] solution(int x, int n) {
        long[] answer = IntStream.range(1,n+1)
                .mapToLong(v -> (long) x * v)
                .toArray();
        return answer;
    }

    public long[] solution2(int x, int n) {
        long[] answer = new long[n];
        Arrays.setAll(answer, i -> (long) x * (i + 1));
        return answer;
    }


}
