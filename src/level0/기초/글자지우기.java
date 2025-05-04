package level0.기초;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class 글자지우기 {
    // 문자열 my_string과
    // 정수 배열 indices가 주어질 때,
    // my_string에서 indices의
    // 원소에 해당하는 인덱스의 글자를 지우고
    // 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요

    public String solution(String my_string, int[] indices) {
        StringBuilder builder = new StringBuilder(my_string);

        for (int n : indices){
            builder.deleteCharAt(n);
            builder.insert(n," ");
            System.out.println(builder);
        }
        return  builder.toString().replace(" ","");
    }

    public String solution2(String my_string, int[] indices) {
        StringBuilder builder = new StringBuilder(my_string);

        // indices를 역순 정렬
        Arrays.sort(indices);
        for (int i = indices.length - 1; i >= 0; i--) {
            builder.deleteCharAt(indices[i]);
        }
        return builder.toString();
    }

    public String solution3(String my_string, int[] indices) {
        Set<Integer> indexSet = Arrays.stream(indices).boxed().collect(Collectors.toSet());
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if (!indexSet.contains(i)) {
                builder.append(my_string.charAt(i));
            }
        }
        return builder.toString();
    }
}
