package level0.입문;

import java.util.ArrayList;
import java.util.*;

public class 배열원소의길이 {
    //문자열 배열 strlist가 매개변수로 주어집니다.
    // strlist 각 원소의 길이를 담은 배열을 return하도록 solution 함수를 완성해주세요.

    public int[] solution(String[] strlist) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (String s : strlist){
            list.add(s.length());
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] solution2(String[] strlist) {
        return Arrays.stream(strlist)
                .mapToInt(String::length)
                .toArray();
    }
}
