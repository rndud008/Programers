package level0.입문;

import java.util.*;
import java.util.stream.Collectors;

public class 진료순서정하기 {
    //외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
    // 정수 배열 emergency가 매개변수로 주어질 때
    // 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.

    public int[] solution(int[] emergency) {
        int[] answer = {};

        System.out.println();
        List<Integer> sorted =  new ArrayList<>(Arrays.stream(emergency).sorted().boxed().collect(Collectors.toList()));
        Map<Integer, Integer> rank = new HashMap<>();
        int index =sorted.size();
        for(int number: sorted){
            rank.put(number,index);
            index--;
        }

        for (int i = 0; i < emergency.length; i++) {
            emergency[i] = rank.get(emergency[i]);
        }

        return emergency;
    }

    public int[] solution2(int[] emergency) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int num : emergency) {
            pq.add(num);
        }

        Map<Integer, Integer> rank = new HashMap<>();
        int order = 1;
        while (!pq.isEmpty()) {
            rank.put(pq.poll(), order++);
        }

        return Arrays.stream(emergency)
                .map(rank::get)
                .toArray();
    }

    public int[] solution3(int[] emergency) {
        Integer[] sorted = Arrays.stream(emergency).boxed()
                .sorted(Comparator.reverseOrder())
                .toArray(Integer[]::new);

        Map<Integer, Integer> rank = new HashMap<>();
        for (int i = 0; i < sorted.length; i++) {
            rank.put(sorted[i], i + 1);
        }

        return Arrays.stream(emergency)
                .map(rank::get)
                .toArray();
    }

    public int[] solution4(int[] emergency) {
        TreeMap<Integer, Integer> rank = new TreeMap<>(Comparator.reverseOrder());
        // 내림차순(역순)으로 정렬되도록 설정하는 역할
        for (int num : emergency) {
            rank.put(num, 0); // 초기값을 0으로 저장
        }

        int order = 1;
        for (int key : rank.keySet()) {
            rank.put(key, order++);
        }

        return Arrays.stream(emergency)
                .map(rank::get)
                .toArray();
    }
}
