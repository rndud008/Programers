package level0.기초;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class 수열과구간쿼리2 {
    // 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다.
    // queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
    //각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 찾습니다.
    //각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요.
    //단, 특정 쿼리의 답이 존재하지 않으면 -1을 저장합니다.

    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int [queries.length];
        int index = 0;
        for (int[] query : queries){
            int start = query[0];
            int end = query[1]+1;
            int val = query[2];

            int[] array = IntStream.range(start, end)
                    .map(i -> arr[i])
                    .filter(i -> i > val )
                    .toArray();
            Arrays.sort(array);

            answer[index] = array.length != 0 ? array[0] : -1;
            index++;

        }
        return answer;
    }

    public int[] solution2(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1] + 1;
            int val = queries[i][2];

            OptionalInt result = IntStream.range(start, end)
                    .map(j -> arr[j])
                    .filter(j -> j > val)
                    .min();

            answer[i] = result.orElse(-1);
        }

        return answer;
    }
}
