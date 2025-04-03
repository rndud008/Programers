package 입문;

import java.util.*;

public class 특이한정렬 {
    // 정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다.
    // 이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다.
    // 정수가 담긴 배열 numlist와 정수 n이 주어질 때
    // numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.

    public int[] solution(int[] numlist, int n) {
        int[] answer = {};
        Map<Integer,Integer> map = new TreeMap<>();
        for (int value : numlist){
            int key = value-n;
            if (map.containsKey(Math.abs(key))){
                Integer getValue;
                if(map.get(key)!= null){
                    getValue = map.get(key);
                }else {
                    getValue = map.get(-key);
                }

                if (value > getValue){
                    map.put(key, value);
                    map.put(-key,getValue);
                    continue;
                }
            }
            map.put(key,value);
        }

        List<Integer> list = new ArrayList<>();
        for (Integer value : map.keySet()){
            list.add(Math.abs(value));
        }
        list.sort(null);

        Map<Integer,Integer> reMap = new TreeMap<>();
        for (Integer value: list){
            reMap.put(value,reMap.getOrDefault(value,0)+1);
        }

        list= new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : reMap.entrySet()) {
            if (entry.getValue()==1){
                int value = map.get(entry.getKey()) != null ? map.get(entry.getKey()) : map.get(-entry.getKey());
                list.add(value);
            }else {
                list.add(map.get(entry.getKey()));
                list.add(map.get(-entry.getKey()));
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] solution2(int[] numlist, int n) {
        // int 배열을 Integer 배열로 변환 (Comparator 사용을 위해)
        Integer[] arr = new Integer[numlist.length];
        for (int i = 0; i < numlist.length; i++) {
            arr[i] = numlist[i];
        }

        // 커스텀 Comparator를 사용하여 정렬
        Arrays.sort(arr, (o1, o2) -> {
            int diff1 = Math.abs(o1 - n);
            int diff2 = Math.abs(o2 - n);
            // 거리가 같으면 더 큰 수가 앞에 오도록 내림차순 정렬
            if(diff1 == diff2) {
                return o2 - o1;
            }
            // 거리가 작을수록 앞으로 오도록 정렬
            return diff1 - diff2;
        });

        // 결과를 int 배열로 변환하여 반환
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }

        return answer;
    }
}
