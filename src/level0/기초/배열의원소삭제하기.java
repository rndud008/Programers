package level0.기초;

import java.util.*;
import java.util.stream.Collectors;

public class 배열의원소삭제하기 {
    // 정수 배열 arr과 delete_list가 있습니다.
    // arr의 원소 중 delete_list의 원소를 모두 삭제하고
    // 남은 원소들은 기존의 arr에 있던
    // 순서를 유지한 배열을 return 하는 solution 함수를 작성해 주세요.

    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        ArrayDeque<Integer> copy = new ArrayDeque<>();
        for (int value : arr){
            copy.add(value);
        }

        for (int value: delete_list){
            if (copy.contains(value)){
                copy.remove(value);
            }
        }
        System.out.println(copy);
        return copy.stream().mapToInt(i -> i).toArray();
    }

    public int[] solution2(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for (int value : arr) {
            list.add(value);
        }

        for (int del : delete_list) {
            list.remove(Integer.valueOf(del)); // remove by value, not index
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

    public int[] solution3(int[] arr, int[] delete_list) {
        Set<Integer> deleteSet = Arrays.stream(delete_list).boxed().collect(Collectors.toSet());

        return Arrays.stream(arr)
                .filter(value -> !deleteSet.contains(value))
                .toArray();
    }


}
