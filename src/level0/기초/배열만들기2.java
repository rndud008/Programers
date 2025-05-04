package level0.기초;

import java.util.ArrayList;
import java.util.List;

public class 배열만들기2 {
    // 정수 l과 r이 주어졌을 때,
    // l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진
    // 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
    //만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다

    public int[] solution(int l, int r) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        boolean check = false;
        for (int i = l; i <= r; i++) {
            if (i % 5 == 0) {
                String[] arr = String.valueOf(l).split("");
                for (String str : arr) {
                    if (!str.equals("5") && !str.equals("0")) {
                        check = true;
                        break;
                    }
                }
                if (check) {
                    check = false;
                    continue;
                }

                list.add(i);
            }
        }
        System.out.println(list);
        if (list.isEmpty()) {
            list.add(-1);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public int[] solution2(int l, int r) {
        List<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (String.valueOf(i).matches("[05]+")) {
                list.add(i);
            }
        }

        if (list.isEmpty()) list.add(-1);

        return list.stream().mapToInt(i -> i).toArray();

    }

    public int[] solution3(int l, int r) {
        List<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (i % 5 != 0) continue;

            boolean valid = true;
            for (char c : String.valueOf(i).toCharArray()) {
                if (c != '0' && c != '5') {
                    valid = false;
                    break;
                }
            }

            if (valid) list.add(i);
        }

        if (list.isEmpty()) list.add(-1);

        return list.stream().mapToInt(i -> i).toArray();
    }

}
